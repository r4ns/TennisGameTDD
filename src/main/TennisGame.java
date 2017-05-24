package main;

public class TennisGame 
{	
	private int player1Points=0;
	private int player2Points=0;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		// TO BE IMPLEME
	}
	
	public void player1Scored() throws TennisGameException  {
		
		
			
		checkGameEnded();
		if(gameEnded==true){

			throw new TennisGameException();
		} else {

			player1Points++;

		}
	}
	
	public void player2Scored() throws TennisGameException{
		
		checkGameEnded();
		if(gameEnded==true){

			throw new TennisGameException();
		} else {

			player2Points++;
		}
	}
	
	
	public boolean checkGameEnded()
	{ 
		if((player1Points>=4 && player1Points>=(player2Points+2)) || (player2Points>=4 && player2Points>=(player1Points+2))){

			gameEnded=true;
			return true;

		} else {

			gameEnded=false;
			return false; 
		}
	}
	
	
	
	
	
	public String getScoreString(int points){
		
		if(points == 0){
			
			return "0";
			
		} else if(points == 1){
			
			return "15";
		} else if(points == 2){
			
			return "30";
		} else if(points == 3){
			
			return "40";
		}
		
		return "";
		
	}
	
	public String getScore(){
		
		if(player1Points==0 && player2Points==0){
			
			return getScoreString(0) + " - " + getScoreString(0);
			
		} else if(player1Points==1 && player2Points==0){
			
			return getScoreString(1) + " - " + getScoreString(0);
		} else if(player1Points==2 && player2Points==0){
			
			return getScoreString(2) + " - " + getScoreString(0);
		} else if(player1Points==3 && player2Points==0){
			
			return getScoreString(3) + " - " + getScoreString(0);
		} else if(player2Points==1 && player1Points==0){
			
			return getScoreString(0) + " - " + getScoreString(1);
		} else if(player2Points==2 && player1Points==0){
			
			return getScoreString(0) + " - " + getScoreString(2);
		} else if(player2Points==3 && player1Points==0){
			
			return getScoreString(0) + " - " + getScoreString(3);
		} else if(player2Points==1 && player1Points==1){
			
			return getScoreString(1) + " - " + getScoreString(1);
		}else if(player1Points==2 && player2Points==1){
			
			return getScoreString(2) + " - " + getScoreString(1);
		}else if(player1Points==1 && player2Points==2){
			
			return getScoreString(1) + " - " + getScoreString(2);
			
		}else if(player1Points==1 && player2Points==3){
			
			return getScoreString(1) + " - " + getScoreString(3);
		}else if(player1Points==2 && player2Points==3){
			
			return getScoreString(2) + " - " + getScoreString(3);
		} else if(player1Points==3 && player2Points==1){
			
			return getScoreString(3) + " - " + getScoreString(1);
		}else if(player1Points==3 && player2Points==2){
			
			return getScoreString(3) + " - " + getScoreString(2);
		}else if(player1Points==3 && player2Points==3){
			
			return "deuce";
			
		} else if((player1Points>=3 && player2Points>=3) && (player1Points==player2Points+1 || player2Points==player1Points+1)){
			
			return "adventage";
		}
		 
		return "";
		
		
	}
	
	public void check() throws TennisGameException {
		
		if((player1Points>=4 && player1Points-player2Points==2) || (player2Points>=4 && player2Points-player1Points==2)){
			
			throw new TennisGameException();
		}
		
		
	}
	
	
	
	
	

}
