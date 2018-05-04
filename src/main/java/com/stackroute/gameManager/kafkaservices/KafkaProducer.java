package com.stackroute.gameManager.kafkaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.gameManager.domain.Game;


@Service
public class KafkaProducer {

	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	@Value("${kafka.topic.gameManager}")
	String kafkaTopic ;
	
	
	public void send(Game gameManager) {
	    System.out.println("sending data="+ gameManager);
	    kafkaTemplate.send(kafkaTopic, gameManager);
	}
}
