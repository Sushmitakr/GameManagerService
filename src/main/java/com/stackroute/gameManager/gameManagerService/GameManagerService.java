package com.stackroute.gameManager.gameManagerService;

import com.stackroute.gameManager.domain.Game;

public interface GameManagerService {
	public Game addGameManager(Game gameManager);
	public Iterable<Game> getAllGameManagers();
	/*public boolean checkid(int id);*/
	//public Game findGameById(int id);
}
