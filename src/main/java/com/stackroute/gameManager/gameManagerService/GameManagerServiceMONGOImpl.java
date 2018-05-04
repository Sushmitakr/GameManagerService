	package com.stackroute.gameManager.gameManagerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.gameManager.domain.Game;

import com.stackroute.gameManager.repository.GameManagerRepository;



@Service
public class GameManagerServiceMONGOImpl implements GameManagerService{
	
	GameManagerRepository gameManagerRepository;
	
	@Autowired
	public 	GameManagerServiceMONGOImpl(GameManagerRepository gameManagerRepository)
	{
		super();
		this.gameManagerRepository = gameManagerRepository;
	}
	
	@Override
	public Game addGameManager(Game gameManager)
	{
		//System.out.println(gameManager.getQuestionLevels().getAdvlevel());
		try
		{
			gameManagerRepository.save(gameManager);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return gameManager;
	}
	
	@Override
	public Iterable<Game> getAllGameManagers() {
		Iterable<Game> gameManagerlist = gameManagerRepository.findAll();
				return gameManagerlist;
	}
	

	/*@Override
	public Game findGameById(int id) {
		Game foundQuestion = gameManagerRepository.findById(id).orElse(null);
		return foundQuestion;
	}*/

	/*@Override
	public boolean checkid(int id) {
		return gameManagerRepository.existsById(id);
	}*/
}
