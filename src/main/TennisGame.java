package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		player1Points=0;
		player2Points=0;
		gameEnded=false;
	}
	
	public void player1Scored(){
		/*checkGameEnded();
		if(gameEnded)
			throw new TennisGameException();
		else
			player1Points++;
		checkGameEnded();*/
	}
	
	public void checkGameEnded(){
		if(player1Points >=3 || player2Points >= 3 && Math.abs(player1Points - player2Points) > 2)
			gameEnded = true;
	}
	
	public void player2Scored(){
		/*checkGameEnded();
		if(gameEnded)
			throw new TennisGameException();
		else
			player2Points++;
		checkGameEnded();*/
	}
	public String getScore(int points)
	{
		if(points == 0)
			return "0";
		else if(points == 1)
			return "15";
		else if(points == 2)
			return "30";
		else if(points == 3)
			return "40";
		else if(points==4)
			return "deuce";
	
		return "";
	}
	public String getScore(){
		if(player1Points < 3 || player2Points < 3)
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if(player1Points >= 3 && player2Points >= 3 && player1Points == player2Points)
			return "deuce";
		else if(player1Points >3 && player1Points-player2Points == 1)
			return "advantage player1";
		else if(player2Points >3 && player2Points-player1Points == 1)
			return "advantage player2";
		else if(player1Points > 3 && player1Points-player2Points > 2)
			return "player1 won";
		else if(player2Points > 3 && player2Points-player1Points > 2)
			return "player2 won";
		return "";
	}

}
