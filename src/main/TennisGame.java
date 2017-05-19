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
	
	public void player1Score() throws TennisGameException {
		check();
		if (gameEnded == true) {
			throw new TennisGameException();
		}
		else {
			this.player1Points++;
		}
	}
	
	public void player2Score() throws TennisGameException {
		check();
		if (gameEnded == true) {
			throw new TennisGameException();
		}
		else {
			this.player2Points++;
		}
	}
	
	public void check() {
		if (this.player1Points > 3 && this.player1Points >= this.player2Points - 2) {
			gameEnded = true;
		}
		else if (this.player2Points > 3 && this.player2Points >= this.player1Points - 2) {
			gameEnded = true;
		}
	}
	
	public String getScore() {
		if (this.player1Points > 3 && this.player1Points == this.player2Points+1) {
			return this.score(player1Points) + " player1";
		}
		else if (this.player2Points > 3 && this.player2Points == this.player1Points+1) {
			return this.score(player2Points) + " player2";
		}
		else if (this.player1Points > 3 && this.player1Points >= this.player2Points - 2) {
			return "player1 wins";
		}
		else if (this.player2Points > 3 && this.player2Points >= this.player1Points - 2) {
			return "player2 wins";
		}
		else if (this.player1Points < 3 && this.player2Points < 3) {
			return this.score(player1Points) + " - " + this.score(player2Points);
		}
		else if (this.player1Points == 3 && this.player2Points < 3) {
			return this.score(player1Points) + " - " + this.score(player2Points);
		}
		else if (this.player2Points == 3 && this.player1Points < 3) {
			return this.score(player1Points) + " - " + this.score(player2Points);
		}
		else if (this.player1Points == 3 && this.player2Points == 3) {
			return "deuce";
		}
		else
			return "";
	}
	
	public String score(int points) {
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
		else {
			return "Advantage";
		}
	}

}
