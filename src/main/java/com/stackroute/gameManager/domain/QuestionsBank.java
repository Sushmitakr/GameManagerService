/*package com.stackroute.gameManager.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="questionBank")
public class QuestionsBank {

	@Id
	private int gameId;
	private int categoryId;
	private String categoryName;
	public int topicId;
	

	public  QuestionsBank() {
		
	}
	public QuestionsBank(int gameId, int categoryId, String categoryName, int topic) {
		super();
		this.gameId = gameId;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.topicId = topic;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getTopic() {
		return topicId;
	}
	public void setTopic(int topicId) {
		
		this.topicId = topicId;
	}	
}
*/