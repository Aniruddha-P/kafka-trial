package com.kafka.trial.kafkatrial.consumer.service;

import com.kafka.trial.kafkatrial.common.dto.KafkaMessage;
import com.kafka.trial.kafkatrial.common.dto.constants.KafkaConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@Slf4j
@Service
public class KafkaConsumerMessageListener {

    @Autowired
    private ConsumedKafkaMessageStore consumedKafkaMessageStore;

    @KafkaListener(id = "kafka-consumer-group", topics = KafkaConstants.KAFKA_TOPIC)
    public void consume(@Payload List<String> messages,
                        @Header(value = KafkaHeaders.RECEIVED_MESSAGE_KEY, required = false) List<String> keys,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List<Integer> partitions,
                        @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        log.info("Consumed messages from Kafka! - " + messages);
        List<KafkaMessage> kafkaMessages = new ArrayList<>();
        IntStream.range(0,messages.size()).forEach(index -> {
            KafkaMessage kafkaMessage = new KafkaMessage(Objects.nonNull(keys)?keys.get(index):"", messages.get(index));
            kafkaMessages.add(kafkaMessage);
            log.info("Creating KafkaMessage.. " + kafkaMessage);
        });
        consumedKafkaMessageStore.populateConsumedKafkaMessageStore(kafkaMessages);
    }
}
