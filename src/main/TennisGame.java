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

	public String getScore() {
		if(player1Points <= 2 || player2Points <=2){
			return formatScore(player1Points) + " - " + formatScore(player2Points);
		}else if (player1Points == player2Points){
			return "deuce";
		}else if (player1Points == player2Points + 1){
			return "prednost igrac 1";
		}else if (player1Points + 1== player2Points){
			return "prednost igrac 2";
		}else if (player1Points == player2Points + 2){
			return "mec igrac 1";
		}else if (player1Points + 2== player2Points){
			return "mec igrac 2";
		}
		return "";
		
		
	}

	public void player1Scored() throws TennisGameException{
		if(gameEnded)
			throw new TennisGameException();
		player1Points++;
		if(player1Points >= 4 && player1Points == player2Points + 2){
			gameEnded = true;
		}
		
	}
	public void player2Scored() throws TennisGameException{
		if(gameEnded)
			throw new TennisGameException();
		player2Points++;
		if(player2Points >= 4 && player2Points == player1Points + 2){
			gameEnded = true;
		}
		
	}
	
	
	public String formatScore(int s){
		if(s == 1){
			return "15";
		}else if(s == 2){
			return "30";
		}else if(s == 3){
			return "40";
		}
		return "0";
	}

	
	
	

}
