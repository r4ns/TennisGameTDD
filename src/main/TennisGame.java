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
	
	public void player1Scored() throws TennisGameException
	{
		checkGameEnded();
		if(gameEnded)
			throw new TennisGameException("Game already ended, player 1 can't score");
		else 
			player1Points++;
	}
	
	public void player2Scored() throws TennisGameException
	{
		checkGameEnded();
		if(gameEnded)
			throw new TennisGameException("Game already ended, player 2 can't score");
		else
			player2Points++;
	}
	
	public void checkGameEnded()
	{
		if((player1Points >= 4) && (player1Points >= player2Points + 2) || ((player2Points >=4) && (player2Points >= player1Points + 2)))
			gameEnded = true;
	}
	
	public String convScore(int points)
	{
		String convPoints = "";
		switch(points)
		{
		case 0: convPoints = "0";
			break;
		case 1: convPoints = "15";
			break;
		case 2: convPoints = "30";
			break;
		case 3: convPoints = "40";
			break;
		}
		
		return convPoints;
	}
	
	public String getScore()
	{
		String score = "";
		
		if((player1Points >= 4) && (player1Points >= player2Points + 2))
			score = "game player1";
		else if((player2Points >= 4) && (player2Points >= player1Points + 2))
			score = "game player2";
		else if((player1Points >= 3) && (player2Points >= 3))
		{
			if(player1Points == player2Points)
				score = "deuce";
			else if(player1Points == player2Points + 1)
				score = "adventage player1";
			else if(player2Points == player1Points + 1)
				score = "adventage player2";
		}
		else
			score = convScore(player1Points) + " - " + convScore(player2Points);
		
		return score;
	}

}
