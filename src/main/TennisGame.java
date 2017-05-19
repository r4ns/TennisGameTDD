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
	
	public void checkGameEnded() {
		if((player1Points-player2Points) >= 2 && player1Points > 3){
			
			gameEnded = true;
			
		}
		else if((player1Points-player2Points) >= 2 && player2Points > 3){
			
			gameEnded = true;

		}
		
	}
	public void player1Scored() throws TennisGameException{
		checkGameEnded();
		if(gameEnded == true){
			throw new TennisGameException("Igra je zavrsena");
		}else{
			checkGameEnded();
			player1Points++;
			
		}
	}
	public void player2Scored() throws TennisGameException{
		checkGameEnded();
		if(gameEnded == true){
			throw new TennisGameException("Igra je zavrsena");
		}else{
			checkGameEnded();
			player2Points++;
			
		}
	}
	public String getScore(int points){
		if(points == 0){
			return "0";
		}
		else if(points == 1){
			return "15";
		}
		else if(points == 2){
			return "30";
		}
		else if(points == 3){
			return "40";
		}else{
			return "";
		}
		//return "";
	}
	public String getScore(){
		
		if(player1Points<3 || player2Points<3){
			return getScore(player1Points) + " - " + getScore(player2Points);
		}
		else  if((player1Points>=3 && player2Points>=3)&&(player1Points==player2Points))
		{
			return "deuce";
		}
		else if((player1Points>=3 && player2Points>=3)&&(player1Points-player2Points==1))
		{
			return "adventagePlayer1";
		}
		else if((player1Points>=3 && player2Points>=3)&&(player2Points-player1Points==1))
		{
			return "adventagePlayer2";
		}
		else if((player1Points>=3 && player2Points>=3)&&(player2Points-player1Points==2))
		{
			
			return "WinPlayer2";
		}
		else if((player1Points>=3 && player2Points>=3)&&(player1Points-player2Points==2))
		{
			
			return "WinPlayer1";
		}
		
		return "";
	}
	

}
