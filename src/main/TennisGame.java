package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		
	}
	
	public void player1Scored() throws TennisGameException
	{
		if(gameEnded)
			throw new TennisGameException();
		else
		{
			player1Points++;
			checkGameEnded();
		}
	}
	
	public void player2Scored() throws TennisGameException
	{
		if(gameEnded)
			throw new TennisGameException();
		else
		{
			player2Points++;
			checkGameEnded();
		}
	}
	
	private void checkGameEnded()
	{ 
		if((this.player1Points>=4 && this.player1Points-this.player2Points>=2) || (this.player2Points>=4 && this.player2Points-this.player1Points>=2)){
			this.gameEnded=true;
		}
		else
			this.gameEnded=false;
	}

	public String getScore()
	{
		if(this.player1Points==0 && this.player2Points==0){
			return "0 - 0";
		}
		else if(this.player1Points==1 && this.player2Points==0){
			return "15 - 0";
		}
		else if(this.player1Points==2 && this.player2Points==0){
			return "30 - 0";
		}
		else if(this.player1Points==3 && this.player2Points==0){
			return "40 - 0";
		}
		else if(this.player1Points==0 && this.player2Points==1){
			return "0 - 15";
		}
		else if(this.player1Points==0 && this.player2Points==2){
			return "0 - 30";
		}
		else if(this.player1Points==0 && this.player2Points==3){
			return "0 - 40";
		}
		else if(this.player1Points==1 && this.player2Points==1){
			return "15 - 15";
		}
		else if(this.player1Points==2 && this.player2Points==1){
			return "30 - 15";
		}
		else if(this.player1Points==3 && this.player2Points==1){
			return "40 - 15";
		}
		else if(this.player1Points==1 && this.player2Points==2){
			return "15 - 30";
		}
		else if(this.player1Points==2 && this.player2Points==2){
			return "30 - 30";
		}
		else if(this.player1Points==3 && this.player2Points==2){
			return "40 - 30";
		}
		else if(this.player1Points==1 && this.player2Points==3){
			return "15 - 40";
		}
		else if(this.player1Points==2 && this.player2Points==3){
			return "30 - 40";
		}
		else if(this.player1Points>=3 && this.player2Points>=3 && this.player1Points==this.player2Points){
			return "deuce";
		}
		else if(this.player1Points>=3 && this.player2Points>=3 && this.player1Points==this.player2Points+1){
			return "advantage igrac1";
		}
		else if(this.player1Points>=3 && this.player2Points>=3 && this.player2Points==this.player1Points+1){
				return "advantage igrac2";
		}
		else if(this.player1Points>this.player2Points){
			checkGameEnded();
			if(gameEnded)
				return "pobedjuje igrac1";
		}
		else if(this.player2Points>this.player1Points){
			checkGameEnded();
			if(gameEnded)
			return "pobedjuje igrac2";
		}
		
		return "";
	}
}
