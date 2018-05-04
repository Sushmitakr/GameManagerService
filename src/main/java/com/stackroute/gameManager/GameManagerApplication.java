package com.stackroute.gameManager;

//import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.stackroute.gameManager.domain.GameManager;

@SpringBootApplication
public class GameManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameManagerApplication.class, args);
	}
	
	/*KafkaProducer producer;
	
	public void run(String... arg0) throws Exception{
		GameManager gameManager = new GameManager("1","IPL"); //,"Indian Premier League",4580,22
		producer.send(gameManager);
	}*/
}