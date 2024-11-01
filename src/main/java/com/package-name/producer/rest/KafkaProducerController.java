package com.kafka.trial.kafkatrial.producer.rest;

import com.kafka.trial.kafkatrial.common.dto.KafkaMessage;
import com.kafka.trial.kafkatrial.common.dto.constants.KafkaConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

@Slf4j
@RestController
@RequestMapping("/producer")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping
    public Mono<ResponseEntity<KafkaMessage>> produceMessage(@RequestBody KafkaMessage message) {
        ListenableFuture<SendResult<String, Object>> sendResultListenableFuture = kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC, message.getKey(), message.getValue());

        return Mono.fromSupplier(() -> {
                    try {
                        return sendResultListenableFuture.get();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                })
                .doOnNext(stringObjectSendResult -> {
                    log.info("Produced message on Kafka! - " + stringObjectSendResult.getRecordMetadata().toString());
                })
            .then(Mono.just(ResponseEntity.ok(message)))
                    .doOnError(throwable -> {
                        log.info("Error while producing message on Kafka! - " + throwable.toString());
                        Mono.just(ResponseEntity.internalServerError().body(throwable));
                    });
    }
}
