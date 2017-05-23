package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	private boolean gameEnded1;
	private boolean gameEnded2;
	
	public TennisGame(){
		player1Points=0;
		player2Points=0;
		gameEnded=false;
	}
	public void player1Scored() throws TennisGameException{
		if(gameEnded == true){
			throw new TennisGameException();
		}else{
			player1Points++;
			checkGameEnded();
		}
	}
	public void player2Scored() throws TennisGameException{
		if(gameEnded == true){
			throw new TennisGameException();
		}else{
			player2Points++;
			checkGameEnded();
		}
	}

	private void checkGameEnded() {
		if((player1Points-player2Points) == 2 && player1Points > 3){
			gameEnded1 = true;
			gameEnded = true;
			
		}
		else if((player1Points-player2Points) == 2 && player2Points > 3){
			gameEnded2 = true;
			gameEnded = true;

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
			
		}
		return "";
	}
	
	public String getScore(){
		if(gameEnded1 == true){
			return "win Player 1";
		}
		else if(gameEnded2 == true){
			return "win Player 2";
		}
		else if(player1Points<3 || player2Points<3){
			return getScore(player1Points) + " - " + getScore(player2Points);
		}
		
		else if(player1Points == (player2Points + 1)){
			return "advantage Player 1";
		}
		else if((player1Points + 1) == player2Points){
			return "advantage Player 2";
		}
		else if(player1Points == player2Points){
			return "deuce";
		}
		else{	
		}
		return "";
	}
	public int getPlayer1Points() {
		return player1Points;
	}

	public void setPlayer1Points(int player1Points) {
		this.player1Points = player1Points;
	}

	public int getPlayer2Points() {
		return player2Points;
	}

	public void setPlayer2Points(int player2Points) {
		this.player2Points = player2Points;
	}

	public boolean isGameEnded() {
		return gameEnded;
	}

	public void setGameEnded(boolean gameEnded) {
		this.gameEnded = gameEnded;
	}

}
