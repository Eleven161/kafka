package com.microservice.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics = "learning_Topic",groupId = "learning_group")
	public void listenToTopic(String receivedMsg) {
		System.out.println("The message received is : "+receivedMsg);
	}

}
