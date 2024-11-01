package com.kafka.trial.kafkatrial.consumer.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConsumerConfig {

    //1. Create Kafka Consumer Properties
    @Bean
    public Map<String, Object> kafkaConsumerProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, 5000);
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        properties.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 10000);
        properties.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, 10);
        /*
        properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, 10000);
        properties.put(ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG, 3000);
        */
        return properties;
    }

    //2. Create Kafka Consumer Factory from Kafka Consumer Properties
    @Bean
    public DefaultKafkaConsumerFactory kafkaConsumerFactory() {
        DefaultKafkaConsumerFactory<String, Object> kafkaConsumerFactory = new DefaultKafkaConsumerFactory<>(kafkaConsumerProperties());
        return kafkaConsumerFactory;
    }

    //3. Create KafkaListnerContainerFactory ( for @KafkaListner annotated method working) from Kafka Consumer Factory
    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Object>> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String,Object> kafkaListenerContainerFactory = new ConcurrentKafkaListenerContainerFactory<>();
        kafkaListenerContainerFactory.setConsumerFactory(kafkaConsumerFactory());
        //kafkaListenerContainerFactory.getContainerProperties().setPollTimeout(1000);
        return kafkaListenerContainerFactory;
    }
}
