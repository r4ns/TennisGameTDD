package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	
	
	public TennisGame() 
	{
		this.player1Points = player1Points = 0;
		this.player2Points = player2Points = 0;
		
	}
	
	public void player1Scored(){
		if(player1Points == 0){
			player1Points++;
		} else if(player1Points == 1){
			player1Points++;
		} else if(player1Points == 2){
			player1Points++;
		} else if(player1Points == 3){
			player1Points++;
		} else
			player1Points++;
		
	}
	
	public void player2Scored(){
		if(player2Points == 0){
			player2Points++;
		} else if(player2Points == 1){
			player2Points++;
		} else if(player2Points == 2){
			player2Points++;
		} else if(player2Points == 3){
			player2Points++;
		} else
			player2Points++;
	}
	
	
	public String getScore(int points){
		
		switch(points){
		case 0: return "0";
		
		case 1: return "15";
		
		case 2: return "30";
		
		case 3: return "40";
		
		case 4: return "advantage";
		
		default: return "";
		
		}
		
	}
	
	
	public String getScore(){
		if(getScore(player1Points) == "40" && getScore(player2Points) == "40"){
			return "deuce";
		} else if(getScore(player1Points) == "advantage" && getScore(player2Points) == "40"){
			return "advantage player 1";
		}  else if(getScore(player2Points) == "advantage" && getScore(player1Points) == "40"){
			return "advantage player 2";
		} 
			
		else 
			return getScore(player1Points) + " - " + getScore(player2Points);
		
		
		
	}


	public int getPlayer1Points() {
		return player1Points;
	}


	public int getPlayer2Points() {
		return player2Points;
	}


	public boolean isGameEnded() {
		return gameEnded;
	}


	public void setPlayer1Points(int player1Points) {
		this.player1Points = player1Points;
	}


	public void setPlayer2Points(int player2Points) {
		this.player2Points = player2Points;
	}


	public void setGameEnded(boolean gameEnded) {
		this.gameEnded = gameEnded;
	}
	
	
	

}
