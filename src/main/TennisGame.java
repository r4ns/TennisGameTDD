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
	private String getScore(int points) 

	{

		if(points==0){
			return "0";
		}else if(points==1){
			return "15";
		}else if(points==2){
			return "30";
		}else if(points==3){
			return "40";
		}
		return "";

	}
	public String getScore() {
		if(player1Points<3 || player2Points<3){
			return getScore(player1Points)+" - "+getScore(player2Points);
		}else if(player1Points>=3&&player2Points>=3&&player1Points==player2Points){
			return "deuce";
		}else if(player1Points>3&&player2Points+1==player1Points){
			return "advantage player1";
		}else if(player2Points>3&&player1Points+1==player2Points){
			return "advantage player2";
		}else if(gameEnded==true&&player1Points>3){
			return "game player1";
		}else if(gameEnded==true&&player2Points>3){
			return "game player2";
		}
		return "";
	}
	public void player1Scored() throws TennisGameException {
		checkGameEnded();
			if(gameEnded){
				throw new TennisGameException();
			}else{
				player1Points++;
				checkGameEnded();
			}
	
	}
	private void checkGameEnded() {
		if((player1Points>3||player2Points>3)&&Math.abs(player1Points-player2Points)>=2){
			gameEnded=true;
		}
		
	}
	public void player2Scored() throws TennisGameException 
	{
		checkGameEnded();
		if(gameEnded){
			throw new TennisGameException();
		}else{
			player2Points++;
			checkGameEnded();
		}
	}
}
