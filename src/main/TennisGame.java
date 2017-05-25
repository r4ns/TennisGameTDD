package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		player1Points=0;
		player2Points=0;
	}
	public int convertScore(int num){
		 		if(num == 0){
		 			return 0;
		 		} else if(num == 1){
		 			return 15;
		 		} else if (num == 2){
		 			return 30;
		 		} else if(num == 3){
		 			return 40;
		 		} else {
		 			return -1;
		 		}
		 }
	
	public void gameEnded(){
		 		if (player1Points >3 || player2Points >3){
		 			if (Math.abs(player1Points - player2Points) >= 2){
		 				gameEnded = true;
		 			}
		 		}
		 	}
	
	public String getScore() throws TennisGameException{
		 		if(player1Points <=3 && player2Points <=3){
		 			if(player1Points == player2Points && player1Points == 3){
		 				return "deuce";
		 			} else{
		 				return convertScore(player1Points) + " - " + convertScore(player2Points);
		 			} 
		 		} else if (player1Points >3 || player2Points >3){
		 			if(player1Points == player2Points){
		 				return "deuce";
		 			} else if( Math.abs(player1Points - player2Points ) == 1){
		 				if(player1Points > player2Points){
		 					return "advantage player1";
		 				} else{
		 				return "advantage player2";
		 			}
		 			} else if (Math.abs(player1Points - player2Points) >= 2){
		 				if(player1Points > player2Points){
		 					return "game ended, p1 wins!";
		 				} else{
		 					return "game ended, p2 wins!";
		 				}
		 			} 
		 			else{
		 				return "";
		 			}
		 		}	
		 		else {
		 			return "greska...";
		 		}
		 	}
	
	public void player1Scored() throws TennisGameException {
		 		gameEnded();
		 		if(gameEnded){
		 			throw new TennisGameException();
		 		} else{
		 			player1Points++;
		 		}
		 	}
	
		 	public void player2Scored() throws TennisGameException{
		 		gameEnded();
		 		if(gameEnded){
		 			throw new TennisGameException();
		 		} else{
		 		player2Points++;
		 		}
		  	}

}
