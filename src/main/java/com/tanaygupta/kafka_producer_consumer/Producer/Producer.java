package com.tanaygupta.kafka_producer_consumer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @GetMapping("/send")
    public void sendMessage(@RequestParam String message) {
        kafkaTemplate.send("games", message);
        System.out.println("Message sent to Kafka topic");
    }
}
