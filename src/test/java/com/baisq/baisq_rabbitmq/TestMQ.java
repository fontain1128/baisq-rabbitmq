package com.baisq.baisq_rabbitmq;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baisq.rabbitmq.producer.MessageProducer;

public class TestMQ {
	
//	@Autowired
//	private MessageProducer messageProducer;
	
	private ApplicationContext context = null;
	
	@Before
	public void setUp(){
		context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	@Test
	public void test(){
		MessageProducer messageProducer = context.getBean(MessageProducer.class);
		//MessageProducer messageProducer = (MessageProducer) context.getBean("messageProducer");
		messageProducer.sendMessage("Hello,my mq message!");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
