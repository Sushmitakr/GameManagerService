package com.stackroute.maverick.domain;

import org.springframework.data.annotation.Id;

public class GameType {

	@Id
	private int gameTypeId;
	private String singlePlayerTimeBasedGame;
	private String multiPlayerFastestFingerFirst;
	private String singlePlayerAdaptiveGame;
	
	public GameType() {
		super();
		
	}

	public GameType(int gameTypeId, String singlePlayerTimeBasedGame, String multiPlayerFastestFingerFirst,
			String singlePlayerAdaptiveGame) {
		super();
		this.gameTypeId = gameTypeId;
		this.singlePlayerTimeBasedGame = singlePlayerTimeBasedGame;
		this.multiPlayerFastestFingerFirst = multiPlayerFastestFingerFirst;
		this.singlePlayerAdaptiveGame = singlePlayerAdaptiveGame;
	}

	public int getGameTypeId() {
		return gameTypeId;
	}

	public void setGameTypeId(int gameTypeId) {
		this.gameTypeId = gameTypeId;
	}

	public String getSinglePlayerTimeBasedGame() {
		return singlePlayerTimeBasedGame;
	}

	public void setSinglePlayerTimeBasedGame(String singlePlayerTimeBasedGame) {
		this.singlePlayerTimeBasedGame = singlePlayerTimeBasedGame;
	}

	public String getMultiPlayerFastestFingerFirst() {
		return multiPlayerFastestFingerFirst;
	}

	public void setMultiPlayerFastestFingerFirst(String multiPlayerFastestFingerFirst) {
		this.multiPlayerFastestFingerFirst = multiPlayerFastestFingerFirst;
	}

	public String getSinglePlayerAdaptiveGame() {
		return singlePlayerAdaptiveGame;
	}

	public void setSinglePlayerAdaptiveGame(String singlePlayerAdaptiveGame) {
		this.singlePlayerAdaptiveGame = singlePlayerAdaptiveGame;
	}

	@Override
	public String toString() {
		return "GameType [gameTypeId=" + gameTypeId + ", singlePlayerTimeBasedGame=" + singlePlayerTimeBasedGame
				+ ", multiPlayerFastestFingerFirst=" + multiPlayerFastestFingerFirst + ", singlePlayerAdaptiveGame="
				+ singlePlayerAdaptiveGame + "]";
	}
	
	
}
