package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		
	}
	
	public String getScore() throws TennisGameException{
		
		if (player1Points>=3 && player2Points>=3) {
			if (player1Points==player2Points) {
				return "deuce";
			} 
			else if (player1Points==player2Points+1) {
				return "adventage player1";
			}
			else if (player2Points==player1Points+1) {
				return "adventage player2";
			}
			else if (player1Points==player2Points+2) {
				gameEnded=true;
				return "game player1";
			}
			else if (player2Points==player1Points+2) {
				gameEnded=true;
				return "game player2";
			}
		}
		if (player1Points>3) {
			gameEnded=true;
			return "game player1";
		}
		else if (player2Points>3 && player1Points<3){
			gameEnded=true;
			return "game player2";
		}
		return score(player1Points)+" - "+score(player2Points);
	}
	
	public void player1Score() throws TennisGameException{
		if (gameEnded) {
			throw new TennisGameException("You finished the game!");
		}
		else {
		player1Points++;
		}
	}
	
	public void player2Score() throws TennisGameException{
		if (gameEnded) {
			throw new TennisGameException("You finished the game!");
		}
		else {
		player2Points++;
		}
	}
	
	public int score(int player) {
		if (player==1) {
			return 15;
		}
		else if (player==2) {
			return 30;
		}
		else if (player==3) {
			return 40;
		}
		return 0;
	}

}
