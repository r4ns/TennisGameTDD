package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
  		// TO BE IMPLEMENTED
  	}
 	public TennisGame(int player1Points, int player2Points, boolean gameEnded){
 		this.player1Points = player1Points;
 		this.player2Points = player2Points;
 		this.gameEnded = false;
 	}
 	
 	public void player1Scored() throws TennisGameException{
 		if(gameEnded == true){
 			throw new TennisGameException();
 		}
 		player1Points++;
 	}
 	
	public void player2Scored() throws TennisGameException{
		if(gameEnded == true){
 			throw new TennisGameException();
 		}
 		player2Points++;
 	}
 	
 	public String score(int score){
 		if(score == 1)
 			return "15";
 		else if(score == 2)
 			return "30";
 		else if(score == 3)
 			return "40";
 		return "0";
 	}
 	
 	public String score(){
 		/*
 		if(player1Points == 0 && player2Points == 0)
 			return "0 - 0";
 		else if(player1Points == 1 && player2Points == 0)
 			return "15 - 0";
 		else if(player1Points == 2 && player2Points == 0)
 			return "30 - 0";
 		else if(player1Points == 4 && player2Points == 0)
 			return "40 - 0";
 			*/
 		if(player1Points == 4 && player2Points < 3){
 			gameEnded = true;
 			return "game player1";
 			}
 		else if(player1Points < 3 && player2Points == 4){
 			gameEnded = true;
 			return "game player2";
 			}
 		else if((player1Points >= 3 && player2Points >= 3) && (player1Points == player2Points + 2)){
 			gameEnded = true;
 			return"game player1";
 		}
 		else if((player2Points >= 3 && player1Points >= 3) && (player2Points == player1Points + 2)){
 			gameEnded = true;
 			return"game player2";
 		}
 		
 		else if(player1Points == 3 && player2Points == 3){
 			gameEnded = false;
 			return "duece";
 		}
 		else if(player1Points == 4 & player2Points == 3){
 			gameEnded = false;
 			return "advantage player1";
 		}
 		else if(player2Points == 4 & player1Points == 3){
 			gameEnded = false;
 			return "advantage player2";
 		}
 		return score(player1Points) + " - " + score(player2Points);
 	}
 
  }