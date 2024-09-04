package com.wrld.lut_service_ms.senders;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@RequiredArgsConstructor
public class KafkaSender {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topicName, String message) {
        log.info("Sending : {}", message);
        log.info("--------------------------------");

        kafkaTemplate.send(topicName, message);
    }
}