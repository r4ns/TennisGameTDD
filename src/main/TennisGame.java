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
	
	public void player1Scored()
	{
		if(gameEnded != true)
		{
			player1Points++;
		}
		
	}
	
	public void player2Scored()
	{
		if(gameEnded != true)
		{
			player2Points++;
		}
	}
	
	private String getScore(int points)
	{
		if(points == 0)
		{
			return "0";
		}
		else if(points == 1)
		{
			return "15";
		}
		else if(points == 2)
		{
			return "30";
		}
		else if(points == 3)
		{
			return "40";
		}
		else if(points == 4)
		{
			return "advantage";
		}
		else
			return "game ended";
	}
	
	public String getScore()
	{
		if(getScore(player1Points) == "40" && getScore(player2Points) == "40")
		{
			return "deuce";
		}
		if(getScore(player1Points) == "advantage" && getScore(player2Points) == "40" )
		{
			return "advantage player1";
		}
		if(getScore(player1Points) == "40" && getScore(player2Points) == "advantage" )
		{
			return "advantage player2";
		}
		else
			return getScore(player1Points) + " - " + getScore(player2Points);
		
		
			
		
	}

}
