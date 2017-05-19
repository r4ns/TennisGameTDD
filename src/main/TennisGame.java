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
	public void Igrac1vodi() throws TennisGameException
	{
		if(gameEnded)
		    throw new TennisGameException();
		else
		{
			this.player1Points++;
			krajIgre();
		}
	}
	
	
	public void Igrac2vodi() throws TennisGameException
	{
		if(gameEnded)
		   throw new TennisGameException();
		else
		{
			this.player2Points++;
			krajIgre();
		}
	}
	
	public void krajIgre(){
		
		if((this.player1Points>=4 && this.player1Points-this.player2Points>=2) || (this.player2Points>=4 && this.player2Points-this.player1Points>=2)){
			this.gameEnded=true;
		}
		else
			this.gameEnded=false;
		
	}
	
	public String getScore()
	{
		if(this.player1Points == 0 && this.player2Points == 0)
			return "0 - 0";
		else if(this.player1Points == 1 && this.player2Points == 0)
			return "15 - 0";
		else if(this.player1Points == 2 && this.player2Points == 0)
			return "30 - 0";
		else if(this.player1Points == 3 && this.player2Points == 0)
			return "40 - 0";
		else if(this.player1Points == 0 && this.player2Points == 1)
			return "0 - 15";
		else if(this.player1Points == 0 && this.player2Points == 2)
			return "0 - 30";
		else if(this.player1Points == 0 && this.player2Points == 3)
			return "0 - 40";
		else if(this.player1Points == 1 && this.player2Points == 1)
			return "15 - 15";
		else if(this.player1Points == 2 && this.player2Points == 1)
			return "30 - 15";
		else if(this.player1Points == 3 && this.player2Points == 1)
			return "40 - 15";
		else if(this.player1Points == 1 && this.player2Points == 2)
			return "15 - 30";
		else if(this.player1Points == 1 && this.player2Points == 3)
			return "15 - 40";
		else if(this.player1Points == 2 && this.player2Points == 2)
			return "30 - 30";
		else if(this.player1Points == 2 && this.player2Points == 3)
			return "30 - 40";
		else if(this.player1Points == 3 && this.player2Points == 2)
			return "40 - 30";
		else if(this.player1Points >= 3 && this.player2Points >= 3 && this.player1Points==this.player2Points)
			return "deuce";
		else if(this.player1Points>=3 && this.player2Points>=3 && this.player1Points==this.player2Points+1)
			return "advantage igrac1";
		else if(this.player1Points>this.player2Points){
			krajIgre();
			if(this.gameEnded)
			return "pobedjuje igrac1";
		}
		
		return " ";
	}
	
	
}
