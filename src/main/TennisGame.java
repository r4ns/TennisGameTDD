package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		
	}
	
	public TennisGame(int prvi,int drugi,boolean kraj){
		player1Points = prvi;
		player2Points = drugi;
		gameEnded = kraj;			
	}
	
	public void player1Scored() throws TennisGameException{
		if(gameEnded == true){
			throw new TennisGameException();
		} else{
			player1Points++;
		}
	}
	
	public void player2Scored() throws TennisGameException{
		if(gameEnded == true){
			throw new TennisGameException();
		} else{
			player2Points++;
		}
	}
	
	
	public void gameEnded(){
		if((player1Points == 4 || player1Points == 5) && player2Points <= 3){
			gameEnded = true;
		} else if ((player2Points == 4 || player2Points == 5) && player1Points <= 3){
			gameEnded = true;
		} else {
			gameEnded = false;
		}
		
	}
	
	public String getScore(int points){
		if(points == 1){
			return "15";
		} else if (points == 2){
			return "30";
		}else if (points == 3){
			return "40";
		}else if (points == 0){
			return "0";
		} else {
			return "Greska";
		}
	}
		
		
	public String getScore(){	
		if((player1Points == 3) && (player2Points == 3)){
			return "deuce";
		} else if ((player1Points == 4) && (player2Points == 3)){
				return "adv1";	
		} else if ((player2Points == 4) && (player1Points == 3)){
			return "adv2";
		} else if ((player1Points == 4 || player1Points == 5) && player2Points <= 3){
			return "win1";
		} else  if((player2Points == 4 || player2Points == 5) && player1Points <= 3){
			return "win2";
		} else {
			return getScore(player1Points) + " - " + getScore(player2Points);
		}
		
		
	}
		
		
	}


