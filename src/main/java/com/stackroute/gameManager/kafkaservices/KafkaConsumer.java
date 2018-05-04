package com.stackroute.gameManager.kafkaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.stackroute.gameManager.domain.Game;

import com.stackroute.gameManager.repository.GameManagerRepository;

@Service
public class KafkaConsumer {

	@Autowired
	GameManagerRepository gameManagerRepository;
	
	@KafkaListener(topics="${kafka.topic.gameManager}")
    public void processMessage(Game gameManager) {
		System.out.println("received content = " + gameManager);
    }
}
