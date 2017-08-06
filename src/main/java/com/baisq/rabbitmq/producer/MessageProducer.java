package com.baisq.rabbitmq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.baisq.rabbitmq.consumer.MessageConsumer;

@Component
public class MessageProducer{
	
	private Logger logger = LoggerFactory.getLogger(MessageProducer.class); 
	
	@Autowired
	@Qualifier("amqpTemplate")
	private AmqpTemplate amqpTemplate;

	public void sendMessage(Object message) {
		amqpTemplate.convertAndSend(message);
	}

}
