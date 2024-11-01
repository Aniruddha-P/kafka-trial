package com.kafka.trial.kafkatrial.common.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude
@AllArgsConstructor
public class KafkaMessage {

    @JsonProperty
    public String key;
    @JsonProperty
    public String value;
}
