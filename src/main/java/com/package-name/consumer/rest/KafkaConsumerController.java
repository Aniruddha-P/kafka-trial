package com.kafka.trial.kafkatrial.consumer.rest;

import com.kafka.trial.kafkatrial.common.dto.KafkaMessage;
import com.kafka.trial.kafkatrial.consumer.service.ConsumedKafkaMessageStore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequestMapping("/consumer")
public class KafkaConsumerController {

    @Autowired
    private ConsumedKafkaMessageStore consumedKafkaMessageStore;
    @GetMapping
    public Flux<KafkaMessage> getKafkaConsumerMessages() {
        return Flux.fromIterable(consumedKafkaMessageStore.getConsumedKafkaMessages());
    }
}
