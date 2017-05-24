package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	public int pobeda = 0;
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
	}
	
	public void player1Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		/*checkGameEnded();
		if(gameEnded)
			throw new TennisGameException();
		else*/
		if(gameEnded == false)
			this.player1Points++;
		else
			throw new TennisGameException("Player 1 pobedio");
		
	}

	public void player2Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		/*checkGameEnded();
		if(gameEnded)
			throw new TennisGameException();
		else*/
		if(gameEnded == false)
			this.player2Points++;
		else
			throw new TennisGameException("Player 2 pobedio");
		
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
		if((player1Points > 3 && player1Points-2 >= player2Points))
		{
			
			gameEnded = true;
			pobeda = 1;
			
		} else if((player2Points > 3 && player2Points-2 >= player1Points))
		{
			gameEnded = true;
			pobeda = 2;
			
		} else{
			gameEnded = false;
		}
	}

	public String getScore(int points) 
	{
		// TO BE IMPLEMENTED
		
		if(points == 0){
			return "0";
		}else if(points == 1){
			return "15";
		}else if(points == 2){
			return "30";
		}else if(points == 3){
			return "40";
		}else
			
		return "";
	}
	
	public String getScore() 
	{
		checkGameEnded();
		// Scores format: "player1Score - player2Score"
		
		
		// "0 - 0"
		if(player1Points == 0 && player2Points == 0)
			return "0 - 0";
		// "15 - 15"
		else if(player1Points == 1 && player2Points == 1 )
			return "15 - 15";
		// "30 - 30"
		else if(player1Points == 2 && player2Points == 2 )
			return "30 - 30";
		// "deuce"
		else if(player1Points == 3 && player2Points == 3 )
			return "deuce";
		// "15 - 0", "0 - 15"
		else if(player1Points == 1 && player2Points == 0)
			return "15 - 0";
		else if(player1Points == 0 && player2Points == 1)
			return "0 - 15";
		// "30 - 0", "0 - 30"
		else if(player1Points == 2 && player2Points == 0)
			return "30 - 0";
		else if(player1Points == 0 && player2Points == 2)
			return "0 - 30";
		// "40 - 0", "0 - 40"
		else if(player1Points == 3 && player2Points == 0)
			return "40 - 0";
		else if(player1Points == 0 && player2Points == 3)
			return "0 - 40";
		// "30 - 15", "15 - 30"
		else if(player1Points == 2 && player2Points == 1)
			return "30 - 15";
		else if(player1Points == 1 && player2Points == 2)
			return "15 - 30";
		// "40 - 15", "15 - 40"
		else if(player1Points == 3 && player2Points == 1)
			return "40 - 15";
		else if(player1Points == 1 && player2Points == 3)
			return "15 - 40";
		// "advantage player1"
		else if(player1Points > 3 && player2Points == 3)
			return "advantage player1";
		// "advantage player2"
		else if(player2Points > 3 && player1Points == 3)
			return "advantage player2";
		// "game player1"
		else if(gameEnded == true && pobeda == 1)
			return "game player1";
		// "game player2"
		else if(gameEnded == true && pobeda == 2)
			return "game player2";
		else if(player1Points == 3 && player2Points == 2)
			return "40 - 30";
		else if(player1Points == 2 && player2Points == 3)
			return "30 - 40";
		else if(player1Points > 3 && player2Points > 3 && player1Points == player2Points)
			return "deuce";

		// TO BE IMPLEMENTED
		
		
		
		
		
		/*if (gameEnded && pobeda == 1) 
		{
			return "game player1";
			
		} else if (gameEnded && pobeda == 2)
		{
			return "game player2";
			
		} else if (player1Points > 3 && player2Points > 3 && player1Points == player2Points)
		{
			return "deuce";
			
		} else if (player1Points >= 3 && player2Points >= 3 && player1Points-1 == player2Points)
		{
			return "advantage player1";
			
		} else if (player1Points >= 3 && player2Points >= 3 && player1Points == player2Points-1)
		{
			return "advantage player2";
		} else
		{
			return getScore(player1Points) + " - " + getScore(player2Points);
		}*/
		return "";
		
	}

}
