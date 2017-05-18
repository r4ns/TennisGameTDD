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
	
	
	public int getPlayer1Points() {
		return player1Points;
	}


	public void setPlayer1Points(int player1Points) {
		this.player1Points = player1Points;
	}


	public int getPlayer2Points() {
		return player2Points;
	}


	public void setPlayer2Points(int player2Points) {
		this.player2Points = player2Points;
	}


	public boolean isGameEnded() {
		return gameEnded;
	}


	public void setGameEnded(boolean gameEnded) {
		this.gameEnded = gameEnded;
	}


	public void player1scored() throws TennisGameException 
	{
		if(gameEnded==true)
		{
			throw new TennisGameException("Player1 can't score because game had already ended");
		}
		else
		{
			player1Points++;
			checkIfGameEnded();
		}
	}

	public void player2scored() throws TennisGameException 
	{
		if(gameEnded==true)
		{
			throw new TennisGameException("Player2 can't score because game had already ended");
		}
		else 
		{
			player2Points++;
			checkIfGameEnded();
		}
	}
	
	public void checkIfGameEnded(){
		if(player1Points >= 4 && player1Points == player2Points + 2)
		{
			gameEnded=true;
		}
		
		
	}
	
	private String getScore(int points) {
		
		String score = "";
		if(points==0)
		{
			score="0";
		}
		
		else if(points==1)
		{
			score="15";
		}
		else if(points==2)
		{
			score="30";
		}
		else if(points==3)
		{
			score="40";
		}
		
		return score;
		
	}
	
	public String getScore(){
		

		if(player1Points>3 && player2Points==3)
		{
			return "advantage player1";
		}
		else if(player1Points==3 && player2Points>3)
		{
			return "advantage player2";
		}
		else if(player1Points>3 && (player1Points-player2Points)>=2)
		{
			return "player1 won";
		}
		else if(player2Points>3 && (player2Points-player1Points)>=2)
		{
			return "player2 won";
		}
		else if(player1Points==player2Points && player1Points==3 && player2Points==3)
		{
			return "deuce";
		}
		else if(player1Points==player2Points)
		{
			return getScore(player1Points) + " - " + getScore(player2Points);
		}
		else {
			return getScore(player1Points) + " - " + getScore(player2Points);
		}
			
		
	}
	
	
	
	

}
