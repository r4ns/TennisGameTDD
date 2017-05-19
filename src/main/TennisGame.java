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
	
	public String pointsToScore(int points){
		if(points == 0)
			return "0";
		else if(points == 1)
			return "15";
		else if(points == 2)
			return "30";
		else if(points == 3)
			return "40";
		return null;
	}
	public String getScore() {
		// TODO Auto-generated method stub
		if(player1Points >= 3 && player1Points == player2Points)
			return "Deuce";
		if(player1Points >= 3 && player2Points >= 3 && Math.abs(player1Points- player2Points) == 1)
			return "Advantage";
		if(player1Points >= 4 && Math.abs(player2Points - player1Points)== 2)
			return "Player 1 won";
		
		if(player2Points >= 4 && Math.abs(player2Points - player1Points)>= 2){
			return "Player 2 won";
		}
		return pointsToScore(player1Points) + " - " + pointsToScore(player2Points);
		 
		
	}

	public void player1Scored() throws TennisGameException {
		if(gameEnded) 
			throw new TennisGameException("The game has ended");
		player1Points++;
		if(player1Points >= 4 && Math.abs(player2Points - player1Points)== 2){
			gameEnded = true;
		}
		
		
	}

	public void player2Scored() throws TennisGameException {
		if(gameEnded) 
			throw new TennisGameException("The game has ended");
		player2Points++;
		if(player2Points >= 4 && Math.abs(player2Points - player1Points)== 2){
			gameEnded = true;
		}
		
	}

}
