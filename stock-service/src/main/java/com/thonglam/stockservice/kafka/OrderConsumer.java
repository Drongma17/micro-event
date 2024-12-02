package com.thonglam.stockservice.kafka;

import com.thonglam.base_domain.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);


    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(OrderEvent event) {
        LOGGER.info(String.format("Order event received in stock services => %s", event.toString()));
    }
}
