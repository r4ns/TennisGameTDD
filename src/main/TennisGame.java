package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	int pobeda = 0;
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
	}
	TennisGameException ex = new TennisGameException("Game has ended, players can't score more points!");

	public void player1Scored() throws TennisGameException 
	{ 
		checkGameEnded();
		if(!gameEnded)
		player1Points++;
		else if(gameEnded){
			//throw new TennisGameException("Game has ended, players can't score more points!");
			throw ex;
		}
	}

	public void player2Scored() throws TennisGameException 
	{
		checkGameEnded();
		if(!gameEnded)
			player2Points++;
			else{
				throw new TennisGameException("Game has ended, players can't score more points!");
			}
	}
	
	private void checkGameEnded()
	{ 
		if(player1Points > 3 && (player1Points-player2Points)>=2){
			pobeda = 1;
			gameEnded = true;
		}
		
		else if(player2Points > 3 && (player2Points-player1Points)>=2){
			pobeda = 2;
			gameEnded = true;
		}
	}

	private String getScore(int points) 
	{
		if(points == 0){
			return "0";
		}
		if(points == 1){
			return "15";
		}
		if(points == 2){
			return "30";
		}
		if(points == 3){
			return "40";
		}
		return "";
	}
	
	public String getScore() 
	{
		// Scores format: "player1Score - player2Score"
		// "0 - 0"
		checkGameEnded();
		if(player1Points == 0 && player2Points == 0){
			return "0 - 0";
		}
		// "15 - 15"
		else if(player1Points == 1 && player2Points == 1){
			return "15 - 15";
		}
		// "30 - 30"
		else if(player1Points == 2 && player2Points == 2){
			return "30 - 30";
		}
		// "deuce"
		else if(player1Points == 3 && player2Points == 3){
			return "deuce";
		}
		// "15 - 0", "0 - 15"
		else if(player1Points == 1 && player2Points == 0){
			return "15 - 0";
		}
		else if(player1Points == 0 && player2Points == 1){
			return "0 - 15";
		}
		// "30 - 0", "0 - 30"
		else if(player1Points == 2 && player2Points == 0){
			return "30 - 0";
		}
		else if(player1Points == 0 && player2Points == 2){
			return "0 - 30";
		}
		// "40 - 0", "0 - 40"
		else if(player1Points == 3 && player2Points == 0){
			return "40 - 0";
		}
		else if(player1Points == 0 && player2Points == 3){
			return "0 - 40";
		}
		// "30 - 15", "15 - 30"
		else if(player1Points == 2 && player2Points == 1){
			return "30 - 15";
		}
		else if(player1Points == 1 && player2Points == 2){
			return "15 - 30";
		}
		// "40 - 15", "15 - 40"
		else if(player1Points == 3 && player2Points == 1){
			return "40 - 15";
		}
		else if(player1Points == 1 && player2Points == 3){
			return "15 - 40";
		}
		// "40 - 30", "30 - 40"
		else if(player1Points == 3 && player2Points == 2){
			return "40 - 30";
		}
		else if(player1Points == 2 && player2Points == 3){
			return "30 - 40";
		}
		// "advantage player1"
		else if(player1Points > 3 && player2Points == 3){
			return "adventage player1";
		}
		// "advantage player2"
		else if(player1Points == 3 && player2Points > 3){
			return "advantage player2";
		}
		
		// "game player1"
		// "game player2"
		else if(gameEnded == true && pobeda == 1){

				return "game player1";
				}
			else if(gameEnded == true && pobeda == 2){
				return "game player2";
		}
		
		// TO BE IMPLEMENTED
		return "";
	}
}
