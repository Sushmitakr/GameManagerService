package com.stackroute.gameManager.repository;

import org.springframework.data.repository.CrudRepository;

import com.stackroute.gameManager.domain.Game;

public interface GameManagerRepository extends CrudRepository<Game,Integer>  {

	//@Query
			//public Game findAllById(int id, Game game);
			 
		/*@Query
		public Restaurant findByNameAndByLocation(String name, String location);*/
	
}
