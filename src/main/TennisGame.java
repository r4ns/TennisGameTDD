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
	
	public String getScore(){
		String player1PointsString = "";
		String player2PointsString = "";
		if (!(player1Points >= 3) && !(player2Points >= 3)){
			switch(player1Points){
				case 0: player1PointsString = "0"; break;
				case 1: player1PointsString = "1"; break;
				case 2: player1PointsString = "2"; break;
				case 3: player1PointsString = "3"; break;
			}
			switch(player2Points){
				case 0: player2PointsString = "0"; break;
				case 1: player2PointsString = "1"; break;
				case 2: player2PointsString = "2"; break;
				case 3: player2PointsString = "3"; break;
			}
			return player1PointsString + " - " +  player2PointsString;
		} else if (player1Points == 3 && player2Points == 3){
			return "deuce";
		} else if (player1Points > player2Points){
			return "player1 advantage";
		} else {
			return "player2 advantage";
		}
		
	}
	
	public void player1Scores(){
		
	}

}
