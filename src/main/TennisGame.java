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
		if(gameEnded != false)
		{
			throw new TennisGameException();
		}
		else
		{
			player1Points++;
		}
		checkGameEnded();
		
	}
	
	public void player2Scored() throws TennisGameException
	{
		if(gameEnded != false)
		{
			throw new TennisGameException();
		}
		else 
		{
			player2Points++;
		}
		checkGameEnded();
	}
	
	public void checkGameEnded()
	{
		if(player1Points>=4)
		{
			if(player1Points - player2Points == 2)
			{
				gameEnded = true;
			}
			else if(player2Points - player1Points == 2)
			{
				gameEnded = true;
			}
		}
		
		gameEnded = false;
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
		else if(points == 5)
		{
			return "game ended";
		}
		else
			return "";
		}
	
	public String getScore()
	{
		if(player1Points == 0 && player2Points == 0)
		{
			return "0 - 0";
		}
		else if(player1Points == 3 && player2Points == 3)
		{
			return "deuce";
		}
		else if(player1Points == 4 && player2Points == 3)
		{
			return "advantage player1";
		}
		else if(player1Points == 3 && player2Points == 4)
		{
			return "advantage player2";
		}
		else if(player1Points == 5 && player2Points <= 3)
		{
			return "game player1";
		}
		else if(player2Points == 5 && player1Points <= 3)
		{
			return "game player2";
		}
		else
			return getScore(player1Points) + " - " + getScore(player2Points);
		
		
			
		
	}

}
