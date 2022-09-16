package com.example.springbootkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.example.springbootkafka.constants.AppConstants;

@Service
public class KafKaConsumerService
{
    private final Logger logger =
            LoggerFactory.getLogger(KafKaConsumerService.class);

    @KafkaListener(topics = AppConstants.TOPIC_NAME,
            groupId = AppConstants.GROUP_ID)
    public void consume(String message)
    {
        logger.info(String.format("Message recieved -> %s", message));
    }
}
