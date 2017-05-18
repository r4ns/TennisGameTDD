package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
	}
	
	public void player1Scored() throws TennisGameException {
		if(gameEnded) {
			throw new TennisGameException();
		} 
		player1Points++;
		
		if(player1Points >= 3 && player2Points >= 3 && player1Points == player2Points+2)
			gameEnded = true;
	}
	
	public void player2Scored() throws TennisGameException {
		if(gameEnded) {
			throw new TennisGameException();
		}
		
		player2Points++;
		
		if(player1Points >= 3 && player2Points >= 3 && player1Points+2 == player2Points)
			gameEnded = true;
	}
	
	public String score(int bodovi) {
		String scor = "";
		if (bodovi == 0) {
			scor = "0";
		} else if (bodovi == 1) {
			scor = "15";
		} else if (bodovi == 2) {
			scor = "30";
		} else if (bodovi == 3) {
			scor = "40";
		} 
		
		
		return scor;
	}
	
	public String getScore () {
		if(player1Points >= 3 && player2Points >= 3 && player1Points == player2Points) {
			return "deuce";
		} else if (player1Points >= 3 && player2Points >= 3 && player1Points == player2Points+1) {
			return "advantage player1";
		} else if (player1Points >= 3 && player2Points >= 3 && player1Points+1 == player2Points) {
			return "advantage player2";
		} else if (player1Points >= 3 && player2Points >= 3 && player1Points == player2Points+2) {
			return "win1";
		} else if (player1Points >= 3 && player2Points >= 3 && player1Points+2 == player2Points) {
			return "win2";
		} else {
			String prvi = score(player1Points);
			String drugi = score(player2Points);
			return prvi + " - " + drugi;
		}
		
	}

}
