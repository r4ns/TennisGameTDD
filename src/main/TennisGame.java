package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
	}
	
	public void player1Scored() throws TennisGameException 
	{
		if(gameEnded)
			throw new TennisGameException("Greska");
			
		player1Points++;
		checkGameEnded();
	}

	public void player2Scored() throws TennisGameException 
	{
		if(gameEnded)
			throw new TennisGameException("Greska");
		
		player2Points++;
		checkGameEnded();
	}
	
	private void checkGameEnded()
	{ 
		if((player1Points >= 4 || player2Points >= 4) && (Math.abs(player1Points - player2Points) >= 2))
			gameEnded = true;
	}

	private String getScore(int points) 
	{
		switch(points){
		case 0: return "0";
		case 1: return "15";
		case 2: return "30";
		case 3: return "40";	
		}
		return "";
	}
	
	public String getScore() 
	{

		if(player2Points >= 4 && (player2Points >= player1Points + 2))
			return "game player2";
		
		if(player1Points >= 4 && (player1Points >= player2Points + 2))
			return "game player1";
		
		// TO BE IMPLEMENTED
		if(player2Points >=4 && (player2Points == player1Points + 1))
			return "advantage player2";
		
		if(player1Points >= 4 && (player1Points == player2Points + 1))
			return "advantage player1";
		
		if(player1Points >= 3 && player2Points >= 3 && player1Points == player2Points)
			return "deuce";
		
		return getScore(player1Points) + " - " + getScore(player2Points);
	}

}
