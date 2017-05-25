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
	
	public String getScore()
	{
		if( player1Points>=3 && player1Points==player2Points){
			return "deuce";
		} else if(player1Points>3 && player2Points-player1Points==1){
			return "Player2 advantage";
		} else if(player1Points>3 && player1Points-player2Points==1){
			return "Player1 advantage";
		} else if(player1Points>3 && player1Points-player2Points>1){
			return "Player1 wins";
		} else if(player1Points>3 && player2Points-player1Points>1){
				return "Player2 wins";
		}else {
			return score(player1Points)+ " - "+score(player2Points);
		}
	}
	
	public String score(int points)
	{
		if(points==0){
			return "0";
		}else if(points==1){
			return "15";
		}else if(points==2){
			return "30";
		}else if(points>=3){
			return "40";
		}
		return "";
		
	}
	public void checkGameEnded() {
		 if (player1Points > 3 && (player1Points - player2Points) > 1) {
		 	gameEnded = true;
		 } else if (player2Points > 3 && (player2Points - player1Points) > 1) {
		 	gameEnded = true;
		 }
	}
	public void player1Scored() throws TennisGameException {
		 if (gameEnded) {
			 throw new TennisGameException("Player can't score!");
		 } else {
		 	 player1Points++;
		 	 checkGameEnded();
		 }
	}
	
	public void player2Scored() throws TennisGameException {
		 if (gameEnded) {
		 	throw new TennisGameException("Player can't score!");
		 } else {
		 	player2Points++;
		 	checkGameEnded();
		 }
	}
	
	

}
