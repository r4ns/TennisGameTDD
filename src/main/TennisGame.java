package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
	}
	
	public void player1Scored() throws TennisGameException {
		if (gameEnded) {
			throw new TennisGameException("Player can't score!");
		} else {
			player1Points++;
			checkGameEnded();
		}
	}
	
	public void player2Scored() throws TennisGameException {
		if (gameEnded) {
			throw new TennisGameException("Player can't score!");
		} else {
			player2Points++;
			checkGameEnded();
		}
	}
	
	public void checkGameEnded() {
		if (player1Points > 3 && (player1Points - player2Points) > 1) {
			gameEnded = true;
		} else if (player2Points > 3 && (player2Points - player1Points) > 1) {
			gameEnded = true;
		}
	}
	
	public String getScore(int points) {
		if (points == 0) {
			return "0";
		} else if (points == 1) {
			return "15";
		} else if (points == 2) {
			return "30";
		} else if (points == 3) {
			return "40";
		}
		
		return "";
	}
		
	public String getScore() throws TennisGameException {
	  	if (player1Points >= 3 && player2Points == player1Points) {
			return "deuce";
		} else if (player1Points > 3 && (player1Points - player2Points) == 1) {
			return "advantage player 1";
		} else if (player2Points > 3 && (player2Points - player1Points) == 1) {
			return "advantage player 2";
		} else if (player1Points > 3 && (player1Points - player2Points) > 1) {
			return "game player 1";
		} else if (player2Points > 3 && (player2Points - player1Points) > 1) {
			return "game player 2";
		}	  
		
		return getScore(player1Points) + " - " + getScore(player2Points);
	}

}
