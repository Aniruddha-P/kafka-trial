package com.kafka.trial.kafkatrial.common.dto.constants;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class KafkaConstants {
    public static final String KAFKA_TOPIC = "kafka_topic";
}
