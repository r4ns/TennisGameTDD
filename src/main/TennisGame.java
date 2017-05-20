package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;

	public TennisGame() 
	{
		player1Points=0;
		player2Points=0;
	}

	public int  player1Scored()throws TennisGameException{
		check_EndGame();
		if(gameEnded==false)
			return player1Points++;
		else
			throw new TennisGameException();
	}

	public int  player2Scored()throws TennisGameException{
		check_EndGame();
		if(gameEnded==false)
			return player2Points++;
		else
			throw new TennisGameException();
	}

	public String getScore(){
		check_EndGame();
		if(gameEnded==true){
			if(player1Points==5 && player2Points==3 || player1Points==4 && player2Points<3)
				return "player1 WIN";
			if(player1Points==3 && player2Points==5 || player1Points<3 && player2Points==4)
				return "player2 WIN";
		}
		
		int player1=0;
		int player2=0;
		
		if(player1Points==1) 
			player1=15;
		else if(player1Points==2)
			player1=30;
		else if(player1Points==3)
			player1=40;

		if(player2Points==1)
			player2=15;
		else if(player2Points==2)
			player2=30;
		else if(player2Points==3)
			player2=40;

		if(player1Points==3 && player2Points==3){
			return "deuce";
		}
		if(player1Points==4 && player2Points==3)
			return "player1 advantage";

		if(player1Points==3 && player2Points==4)
			return "player2 advantage";

		return String.valueOf(player1)+" - "+String.valueOf(player2);
	}

	public void check_EndGame(){
		if(player1Points==4 & player2Points==4){
			player1Points--;
			player2Points--;
		}

		if(player1Points>=5 || player1Points==4 && player2Points<3){
			gameEnded=true;
		}

		if(player2Points==5 || player1Points<3 && player2Points==4){
			gameEnded=true;
		}	
	}
}
