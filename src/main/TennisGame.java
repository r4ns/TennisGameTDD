package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points = 0;
		this.player2Points = 0;
		this.gameEnded = false;
	}
	
	public void player1Scored() throws TennisGameException {
		checkIfGameEnded();
		
		if (gameEnded) {
			throw new TennisGameException("The game has already ended!");
		}
		
		player1Points++;
	}
	
	public void player2Scored() throws TennisGameException {
		checkIfGameEnded();
		
		if (gameEnded) {
			throw new TennisGameException("The game has already ended!");
		}
		
		player2Points++;
	}

	private String convertScore(int points) {
		if (points == 0) {
			return "0";
		}
		else if (points == 1) {
			return "15";
		}
		else if (points == 2) {
			return "30";
		}
		else if (points == 3) {
			return "40";
		}
		return "";
	}
	
	private void checkIfGameEnded() {
		if ((player1Points >= 4 && (player1Points - player2Points) >=2) || 
				(player2Points >= 4 && (player2Points - player1Points) >= 2)) {
			gameEnded = true;
		}
	}
	
	public String getScore () {
		checkIfGameEnded();
		
		String player1 = convertScore(player1Points);
		String player2 = convertScore(player2Points);
		if (player1.equals("40") && player2.equals("40")) {
			return "deuce";
		}
		else if (player1Points == 4 && player2Points == 3) {
			return "advantage player1";
		} 
		else if (player1Points == 3 && player2Points == 4) {
			return "advantage player2";
		} 
		else if (gameEnded) {
			if (player1Points > player2Points) return "game player1";
			else return "game player2";
		}
		return player1 + " - " + player2;
	}
}
