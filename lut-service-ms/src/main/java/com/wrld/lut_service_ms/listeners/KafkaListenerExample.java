package com.wrld.lut_service_ms.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaListenerExample {

    // @RetryableTopic(kafkaTemplate = "kafkaTemplate", attempts = "4", backoff = @Backoff(delay = 3000, multiplier = 1.5, maxDelay = 15000))
    @KafkaListener(topics = {"topic-1", "topic-2"}, groupId = "group1")
    @Transactional
    void listener(@Payload String data,
            @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
            @Header(KafkaHeaders.OFFSET) int offset) {
        log.info("Received message [{}] from group1, partition-{} with offset-{}",
                data,
                partition,
                offset);
    }
}