package com.baisq.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baisq.rabbitmq.producer.MessageProducer;


@Controller
@RequestMapping("/mq")
public class RabbitMQController {

	@Autowired
	@Qualifier("messageProducer")
	private MessageProducer messageProducer;
	
	@RequestMapping("/test")
	public void MQTest(){
		messageProducer.sendMessage("hello,my mq message come!");
	}
}
