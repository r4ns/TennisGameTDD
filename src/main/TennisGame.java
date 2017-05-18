package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		this.player1Points=0;
		this.player2Points=0;
	}
	
	public void player1Scored(){
		player1Points++;
	}
	
	public void player2Score(){
		player2Points++;
	}
	
	public String score (int points){
		if(points==0)
			return "0";
		else if(points==1)
			return "15";
		else if(points==2)
			return "30";
		else if(points==3)
			return "40";
		else
		return "";
	}
	
	public String score(){
		if(player1Points==0 && player2Points==0){
			return score(player1Points)+" - "+score(player2Points);	
		}
		else
			return "";
	}

	
	

}
