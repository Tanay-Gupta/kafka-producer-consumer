package com.tanaygupta.kafka_producer_consumer.Consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = {"games"}, groupId = "my-group")
    public void consumeMessage(String message) {
        System.out.println("Message received from Kafka topic: " + message);
    }
}
