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
		this.gameEnded = false;
	}

	public int getScore(int point)
	{
		if(point == 1)
		{
			return 15;
		}
		else if(point == 2)
		{
			return 30;
		}
		else if(point == 3)
		{
			return 40;
		}
		else{
			return 0;
		}
	}
	public String getScore()
	{
		this.player1Points = getScore(this.player1Points);
		this.player2Points = getScore(this.player2Points);
		if(this.player1Points == 40 && this.player2Points==40){
			return "deuce";
		}
		else{
			return this.player1Points + " - " + this.player2Points;
		}
	}
	
	public int player1Scored(){
		return this.player1Points++;
	}
	public int player2Scored(){
		return this.player2Points++;
	}
}
