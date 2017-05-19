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
	
	public void player1Score() throws TennisGameException{
		if(gameEnded==false){
			player1Points++;
			checkGame();
		}else
			throw new TennisGameException();
	}
	
	public void player2Score(){
		if(gameEnded==false){
			player2Points++;
			checkGame();
		}
	}
	
	public void checkGame(){
		if((player1Points==4||player1Points==5)&&player1Points - player2Points >=2)
			gameEnded=true;
		else if((player2Points==4||player2Points==5)&&player2Points - player1Points >=2)
			gameEnded=true;
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
		}else if(points==5){
			return "adv";
		}else{
			return "";
		}
	}

	public String getScore(){
		if(getScore(player1Points)=="40"&&getScore(player2Points)=="40")
			return "deuce";
		else if(getScore(player1Points)=="win"&&getScore(player2Points)=="40")
			return "advantage player1";
		else if(getScore(player2Points)=="win"&&getScore(player1Points)=="40")
			return "advantage player2";
		else if(gameEnded==true && (getScore(player1Points)=="win" || getScore(player1Points)=="adv"))
			return "game player1";
		else if(gameEnded==true && (getScore(player2Points)=="win" || getScore(player2Points)=="adv"))
			return "game player2";
		else
			return getScore(player1Points)+" - "+getScore(player2Points);
	}
}
