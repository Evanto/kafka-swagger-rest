# Docker compose examples
    
    Run Kafka Server & Kafka Swagger Rest in one container
    docker-compose -f kafka_schema-registry_kafka-swagger-rest.yml up
        
    Run Kafka Server & Kafka Swagger Rest in two containers
    docker-compose -f kafka_schema-registry.yml up
    docker-compose -f kafka-swagger-rest.yml up
    
## kafka_schema-registry_kafka-swagger-rest.yml:

    zookeeper (localhost)
    kafka (localhost)
    schema-registry (localhost)
    kafka-swagger-rest (localhost)

## kafka_schema-registry.yml
    zookeeper (localhost)
    kafka (localhost)
    schema-registry (localhost)

## kafka-swagger-rest.yml
    kafka-swagger-rest (localhost)
