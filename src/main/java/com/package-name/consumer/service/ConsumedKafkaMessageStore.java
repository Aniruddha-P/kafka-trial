package com.kafka.trial.kafkatrial.consumer.service;

import com.kafka.trial.kafkatrial.common.dto.KafkaMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import  java.util.List;

@Slf4j
@Service
public class ConsumedKafkaMessageStore {

    private static final List<KafkaMessage> KAFKA_MESSAGE_LIST = new ArrayList<>();

    public List<KafkaMessage> getConsumedKafkaMessages() {
        return KAFKA_MESSAGE_LIST;
    }

    public void populateConsumedKafkaMessageStore(List<KafkaMessage> consumedMessages) {
        log.info("Populating ConsumedKafkaMessageStore with consumed messages!");
        KAFKA_MESSAGE_LIST.addAll(consumedMessages);
    }
}
