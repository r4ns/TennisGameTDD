package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		player1Points=0;
		player2Points=0;
		gameEnded=false;
	}
	
	public void player1scored()
	{
		player1Points++;
	}
	public void player2scored()
	{
		player2Points++;
	}
	
	public String getScore(int points)
	{
		String rez="";
		if (points==0)
		{
			rez="0";
		} else if (points==1)
		{
			rez="15";
		} else if (points==2)
		{
			rez="30";
		} else if (points==3)
		{
			rez="40";
		}
		return rez;
	}
	
	public String getScore()
	{
		if (player1Points==player2Points)
		{
			if ( player1Points >= 3 && player2Points >=3)
			{
				return "deuce";
			}
			
			return getScore(player1Points) + " - " + getScore(player2Points);
			
		} else if ( player1Points >=3 && player2Points>=3 && (player1Points-player2Points)==1)
		{
			 return "advantage player1";
			 
		} else if (player2Points>=3 && player1Points>=3 && (player2Points-player1Points)==1)
		{
			 return "advantage player2";
			
		} else if (player1Points >=4 && (player1Points-player2Points)>=2)
		{
			return "player1 win";
		
		}else if (player2Points>=4 && (player2Points-player1Points)>=2)
		{
			return "player2 win";
			
		}else 
		{
			return getScore(player1Points) + " - " + getScore(player2Points);
		}
		//return "";
	}

}
