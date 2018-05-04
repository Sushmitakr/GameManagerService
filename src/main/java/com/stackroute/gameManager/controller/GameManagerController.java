package com.stackroute.gameManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.gameManager.domain.Game;
//import com.stackroute.gameManager.exceptions.DatabaseNotAvailableException;
import com.stackroute.gameManager.gameManagerService.GameManagerService;
import com.stackroute.gameManager.kafkaservices.KafkaProducer;

//import ch.qos.logback.core.net.SyslogOutputStream;

@RequestMapping("api/game")
@RestController
@SuppressWarnings("rawtypes")
public class GameManagerController {
	

@Autowired
GameManagerService gameManagerService;

@Autowired
KafkaProducer kafkaProducer;

@GetMapping(value = "/producer")
public String producer(Game gameManager) {
	
	producer(gameManager);
	return "Message sent to the kafka topic game_manager successfully";

}

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/gameManager",method=RequestMethod.POST)
public ResponseEntity<Game>addGameManager(@RequestBody Game gameManager) throws Exception{
	
	//System.out.println(gameManager.getQuestionLevels().getAdvlevel());
	
	Game newGameManager= gameManagerService.addGameManager(gameManager);
	
	return new ResponseEntity<Game>(newGameManager,HttpStatus.OK);
	
}

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/gameManager", method = RequestMethod.GET)
public ResponseEntity showAllGameManager()
{
	return new ResponseEntity<>(gameManagerService.getAllGameManagers(),HttpStatus.OK);
}
}



/*System.out.println("ello"+gameManagerService.checkid(gameManager.getGameId()));

if(!gameManagerService.checkid(gameManager.getGameId()))
{
GameManager newGameManager= gameManagerService.addGameManager(gameManager);
return new ResponseEntity<GameManager>(newGameManager,HttpStatus.OK);
}
else
{
	throw new Exception("game with id "+gameManager.getGameId()+" already exit");
}*/