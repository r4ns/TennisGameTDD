package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		this.player1Points=0;
		this.player2Points=0;
		gameEnded=true;
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
	
	public String score (int points){
		if(points==0)
			return "0";
		else if(points==1)
			return "15";
		else if(points==2)
			return "30";
		else if(points==3)
			return "40";
		else if(points==4)
			return"advantage";
		else
			return "";
		
	}
	
	public String getScore(){
		if(player1Points<=2 || player2Points<=2){
			return score(player1Points)+" - "+score(player2Points);
		}
		else if(player1Points==3 && player2Points==3){
			return "deuce";
		}
		else if(player1Points==4 && player2Points==3){
			return "advantage player 1";
		}
		else if(player2Points==4 && player1Points==3){
			return "advantage player 2";
		}
		else if(player2Points==player1Points+2){
			return "game player 2";
		}
		else if(player1Points==player2Points+2){
			return "game player 1";
		}
		else
			return "";
	}

	
	

}
