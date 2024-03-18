package com.example.kafkapractice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic kafkaTopic(){
        return TopicBuilder
                .name("kafka_jsd")
                .build();
    }

    public NewTopic kafkaJsonTopic(){
        return TopicBuilder
                .name("kafka_jsd_json")
                .build();
    }
}
