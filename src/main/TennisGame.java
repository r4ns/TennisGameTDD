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
		gameEnded = false;
		
	}
	
	public void player1Scored(){
		if(gameEnded == false){
			if(player2Points == 4){
				player2Points --;
			}else
				player1Points ++;
		}
		checkGameEnded();
		
	}
	
	public void player2Scored(){
		

		if(gameEnded == false){
			if(player1Points == 4){
				player1Points --;
			}else
				player2Points ++;
		}
		checkGameEnded();
	}
	
	private void checkGameEnded()
	{ 
		if((player1Points>=4 && player1Points - player2Points >= 2) || (player2Points >=4 && player2Points - player1Points >= 2)){
			gameEnded = true;
		}else {
			gameEnded = false;
		}
	}
	
	
	public String getScore(int points){
		
		switch(points){
		case 0: return "0";
		
		case 1: return "15";
		
		case 2: return "30";
		
		case 3: return "40";
		
		case 4: return "advantage";
		
		case 5: return "win";
		
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
		} else if(gameEnded == true && (getScore(player1Points) == "win" || getScore(player1Points) == "advantage"))
			return "game player1";
		else if(gameEnded == true && (getScore(player2Points) == "win" || getScore(player2Points) == "advantage"))
			return "game player2";
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
