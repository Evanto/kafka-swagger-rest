package com.provectus.kafka.service;

import com.provectus.kafka.swagger.KafkaSwagger;
import com.provectus.kafka.model.config.KafkaSwaggerConfig;
import com.provectus.kafka.model.schema.TopicSwaggerSchema;
import io.swagger.v3.oas.models.OpenAPI;

import java.util.List;

public interface KafkaSwaggerService {

    List<KafkaSwagger> getKafkaSwaggers();

    List<OpenAPI> getSwaggers();

    List<String> getSwaggerSpecs();

    KafkaSwagger registerKafka(KafkaSwaggerConfig kafkaSwaggerConfig);

    TopicSwaggerSchema getTopicSwaggerSchema(String group, String topic);

    KafkaSwagger getKafkaSwagger(String group);

    String getSwaggerSpec(String group);
}
