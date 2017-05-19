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
	
	public void player1Score(){
		if(gameEnded==false){
			player1Points++;
		}
	}
	
	public void player2Score(){
		if(gameEnded==false){
			player2Points++;
		}
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
		}else if(points==4){
			return "win";
		}else{
			return "";
		}
	}

	public String getScore(){
		if(getScore(player1Points)=="40"&&getScore(player2Points)=="40")
			return "deuce";
		else if()
		else
			return getScore(player1Points)+" - "+getScore(player2Points);
	}
}
