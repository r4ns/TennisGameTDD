package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points = 0;
		this.player2Points = 0;
	}

	public void player1Scored() throws TennisGameException 
	{
		this.player1Points++;
	}

	public void player2Scored() throws TennisGameException 
	{
		this.player2Points++;
	}
	
	private void checkGameEnded()
	{
		if(player1Points > 3 && player1Points - player2Points >= 2)
			this.gameEnded = true;
		if(player2Points > 3 && player2Points - player1Points >= 2)
			this.gameEnded = true;
	}

	private String getScore(int points) 
	{
		String x = null;
		if(points == 0)
			x = Integer.toString(points);
		else if(points == 1)
			x = Integer.toString(points+14);
		else if(points == 2)
			x = Integer.toString(points+28);
		else
			x = Integer.toString(points+37);
		return x;
	}
	
	public String getScore() 
	{
		String x = null;
		
		checkGameEnded();
		
		if(player1Points > 2 && player2Points > 2 && player1Points == player2Points)
			x = "deuce";
		else if(player1Points > 2 && player2Points > 2 && player1Points > player2Points)
			x = "advantage igrac 1";
		else if(player2Points > 2 && player1Points > 2 && player2Points > player1Points)
			x = "advantage igrac 2";
		else if(gameEnded == true && player1Points > player2Points)
			x = "pobedjuje igrac 1";
		else if(gameEnded == true && player2Points > player1Points)
			x = "pobedjuje igrac 2";
		else
			x = getScore(player1Points) + " - " + getScore(player2Points);
		return x;
	}
}
