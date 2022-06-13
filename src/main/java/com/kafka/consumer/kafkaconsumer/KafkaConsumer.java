package com.kafka.consumer.kafkaconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class KafkaConsumer {
  @Bean
  public Consumer<Message<String>> messageConsumer() {
    return message -> {
      log.info("Headers = {}", message.getHeaders());
      log.info("Payload = {}", message.getPayload());
    };
  }
}
