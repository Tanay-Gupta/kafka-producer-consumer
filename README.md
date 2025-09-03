# Kafka Producer Consumer Project

## Overview
This project demonstrates the implementation of Kafka producers and consumers using Spring Boot. It provides a simple framework for publishing and consuming messages through Apache Kafka.

## Prerequisites
- Java 17+
- Maven
- Apache Kafka (running on localhost:9092)
- Spring Boot

## Project Structure
```
kafka-producer-consumer/
├── src/main/java/
│   └── com/tanaygupta/kafka_producer_consumer/
│       ├── KafkaProducerConsumerApplication.java  # Main application
│       ├── Consumer/                              # Consumer components
│       │   └── Consumer.java
│       └── Producer/                              # Producer components
│           └── Producer.java
├── src/main/resources/
│   └── application.properties                     # Configuration
└── pom.xml                                        # Maven dependencies
```

## Configuration
The application is configured via `application.properties`:

```properties
spring.application.name=kafka-producer-consumer
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
#spring.kafka.consumer.group-id=my-group
```

## Getting Started
1. Ensure Kafka is running on localhost:9092
2. Build the project:
   ```
   mvn clean install
   ```
3. Run the application:
   ```
   mvn spring-boot:run
   ```

## Usage

### Producer
The application includes a Kafka producer component that can send messages to a Kafka topic.

### Consumer
The application includes a Kafka consumer component that can receive messages from a Kafka topic.

