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
	
	public String getScore(int points){
		if(points==0){
			return "0";
		}else if(points==1){
			return "15";
		}else if(points==2){
			return "30";
		}else if(points==3){
			return "40";
		}else
			return "";
	}

	public String getScore(){
		return getScore(player1Points)+" - "+getScore(player2Points);
	}
}
