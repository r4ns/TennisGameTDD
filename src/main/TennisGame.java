package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	
	public TennisGame() 
	{
		
	}
	public TennisGame(int player1Points, int player2Points, boolean gameEnded) 
	{
		this.player1Points=player1Points;
		this.player2Points=player2Points;
		this.gameEnded=gameEnded;
	}
	

	public String getScore() {
		if(this.player1Points<3 && this.player2Points<3)
			return this.score(player1Points)+" - "+this.score(player2Points);
		else if(this.player1Points==3 && this.player2Points<3)
			return this.score(player1Points)+" - "+this.score(player2Points);
		else if(this.player1Points<3 && this.player2Points==3)
			return this.score(player1Points)+" - "+this.score(player2Points);
		else if(this.player1Points==3 && this.player2Points==3)
			return "deuce";
		else if(this.player1Points>=3 && this.player2Points>=3
				&& this.player1Points-this.player2Points==1
				|| this.player2Points>=3 && this.player1Points>=3 
				&& this.player2Points-this.player2Points==1)
			return "advantage";
		else if(this.player1Points>3 && this.player2Points>=3
				&& this.player1Points-this.player2Points==2)
			return "player1 wins";
		else if(this.player2Points>3 && this.player1Points>=3 
				&& this.player2Points-this.player1Points==2)
			return "player2 wins";
		else return " ";
	}
	public void getGameEnded(){
		if(this.player1Points>3 && this.player2Points<3
				|| this.player2Points> 3 && this.player1Points<3
				||this.player1Points>=3 && this.player2Points>=3 && this.player1Points-this.player2Points==2
				||this.player2Points>=3 && this.player1Points>=3 && this.player2Points-this.player1Points==2)
			this.gameEnded=true;
	}
	
	public String score(int playerPoints) {
		if(playerPoints==0)
			return "0";
		else if(playerPoints==1)
			return "15";
		else if(playerPoints==2)
			return "30";
		else if(playerPoints==3)
			return "40";
		else
			return "advantage";
	}
	
	public void player1Score() throws TennisGameException {
		getGameEnded();
		if(gameEnded)
			throw new TennisGameException();
		else
			
		this.player1Points++;
	}
	public void player2Score() throws TennisGameException{
		getGameEnded();
		if(gameEnded)
			throw new TennisGameException();
		else
			this.player2Points++;
		
	}

}
