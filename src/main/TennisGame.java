package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	private int points;
	
	public TennisGame() 
	{
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
	}
	
	public void player1Score() throws TennisGameException{
		if (!gameEnded){
			player1Points++;
		} else
			throw new TennisGameException();
	}
	
	public void player2Score() throws TennisGameException{
		if (!gameEnded){
			player2Points++;
		} else
			throw new TennisGameException();
	}
	
	
	
	
	private String rezultat(int points) 
  	{
 		if(points == 0)
 			return "0";
 		else if(points==1)
 			return "15";
 		else if(points==2)
 			return "30";
 		else if(points==3)
 			return "40";
 		else if(points==4)
 		return "deuce";
 		else if(points==5)
 			return "advantage";
 		else
 			return "";
  	}
	
	
	public String getScore() 
  	{	
 		if(player1Points < 3 && player2Points < 3)
 			return rezultat(player1Points) + " - " + rezultat(player2Points);
 		else if(player1Points >= 3 && player2Points >= 3 && player1Points == player2Points)
 			return rezultat(4);
 		else if((player1Points ==1 && player2Points == 0 ) || (player1Points == 0 && player2Points == 1 ))
 			return rezultat(player1Points) + " - " + rezultat(player2Points);
 		else if((player1Points == 2  && player2Points == 0 ) || (player1Points == 0 && player2Points == 2 ))
 			return rezultat(player1Points) + " - " + rezultat(player2Points);
 		else if((player1Points == 3  && player2Points == 0 ) || (player1Points == 0 && player2Points == 3 ))
 			return rezultat(player1Points) + " - " + rezultat(player2Points);
 		else if((player1Points == 2  && player2Points == 1 ) || (player1Points == 1 && player2Points == 2 ))
 			return rezultat(player1Points) + " - " + rezultat(player2Points);
 		else if((player1Points == 3  && player2Points == 2 ) || (player1Points == 2 && player2Points == 3 ))
 			return rezultat(player1Points) + " - " + rezultat(player2Points);
 		else if((player1Points == 3  && player2Points == 1 ) || (player1Points == 1 && player2Points == 3 ))
 			return rezultat(player1Points) + " - " + rezultat(player2Points);
 		else if((player1Points == 3  && player2Points == 2 ) || (player1Points == 1 && player2Points == 3 ))
 			return rezultat(player1Points) + " - " + rezultat(player2Points);
 		else if(player1Points >3 && player1Points-player2Points ==1)
 			return "advantage player1";
 		else if(player2Points >3 && player2Points-player1Points ==1)
 			return "advantage player2";
 		else if(player1Points > 3 && player1Points-player2Points >= 2)
 			return "game player1";
 		else if(player2Points > 3 && player2Points-player1Points >= 2)
 			return "game player2";
		
 		return "";
  	}
}
