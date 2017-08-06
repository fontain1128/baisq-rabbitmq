package com.baisq.rabbitmq.consumer;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * queue_one队列消费者
 * @author baisq
 *
 */
public class MessageConsumer implements MessageListener {
	
	private Logger logger = LoggerFactory.getLogger(MessageConsumer.class); 

	@Override
	@RabbitListener(queues="queue_one")
	public void onMessage(Message arg0) {		
		logger.info("consumer receive message------->:{}", arg0.getBody());
	}

}
