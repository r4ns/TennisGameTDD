package main;

public class TennisGame 
{	
	public int player1Points;
	public int player2Points;
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
		if (!(player1Points > 3) && !(player2Points > 3) && !(player1Points == 3 && player2Points == 3)){
			switch(player1Points){
				case 0: player1PointsString = "0"; break;
				case 1: player1PointsString = "15"; break;
				case 2: player1PointsString = "30"; break;
				case 3: player1PointsString = "40"; break;
			}
			switch(player2Points){
				case 0: player2PointsString = "0"; break;
				case 1: player2PointsString = "15"; break;
				case 2: player2PointsString = "30"; break;
				case 3: player2PointsString = "40"; break;
			}
			return player1PointsString + " - " +  player2PointsString;
		} else if (player1Points == 3 && player2Points == 3){
			return "deuce";
		}
		if (player2Points == 4){
			return "player2 advantage";
		} else {
			return "player1 advantage";
		}
	}
	
	public void player1Scores() throws TennisGameException{
		if (player1Points == 3 && player2Points < 3){
			throw new TennisGameException();
		} else if (player1Points >=  4 ){
			throw new TennisGameException();
		}
		
		if (player2Points == 4 && player1Points == 3){
			player2Points--;
		} else {
			player1Points++;
		}
	}

	public void player2Scores() throws TennisGameException{
		if (player2Points == 3 && player1Points < 3){
			throw new TennisGameException();
		} else if (player2Points >=  4 ){
			throw new TennisGameException();
		}
		
		if (player1Points == 4 && player2Points == 3){
			player1Points--;
		} else {
			player2Points++;
		}
	}
}
