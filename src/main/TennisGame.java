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
	public void playerOneScored() throws TennisGameException{
		if(gameEnded==true)
		{
			throw new TennisGameException();
			
		}else{
			
			player1Points++;
		}
	
	}
	public void playerTwoScored() {
		player2Points++;
		
	}
	public String getScore(){
		
		if(player1Points==0&&player2Points==0)
		{
			return getScore(0)+" - "+getScore(0);
		}
		if(player1Points==1&&player2Points==0)
		{
			return getScore(1)+" - "+getScore(0);
		}
		if(player1Points==2&&player2Points==0)
		{
			return getScore(2)+" - "+getScore(0);
		}
		if(player1Points==3&&player2Points==0)
		{
			return getScore(3)+" - "+getScore(0);
		}
		if(player1Points==0&&player2Points==1)
		{
			return getScore(0)+" - "+getScore(1);
		}
		if(player1Points==0&&player2Points==2)
		{
			return getScore(0)+" - "+getScore(2);
		}
		if(player1Points==0&&player2Points==3)
		{
			return getScore(0)+" - "+getScore(3);
		}
		if(player1Points==1&&player2Points==1)
		{
			return getScore(1)+" - "+getScore(1);
		}
		if(player1Points==2&&player2Points==1)
		{
			return getScore(2)+" - "+getScore(1);
		}
		if(player1Points==3&&player2Points==1)
		{
			return getScore(3)+" - "+getScore(1);
		}
		if(player1Points==1&&player2Points==2)
		{
			return getScore(1)+" - "+getScore(2);
		}
		if(player1Points==1&&player2Points==3)
		{
			return getScore(1)+" - "+getScore(3);
		}
		if(player1Points==2&&player2Points==3)
		{
			return getScore(2)+" - "+getScore(3);
		}
		if(player1Points==3&&player2Points==2)
		{
			return getScore(3)+" - "+getScore(2);
		}
		if((player1Points>=3&&player2Points>=3) && player2Points==player1Points)
		{
			return "deuce";
		}
		if((player1Points>=3&&player2Points>=3) && (player1Points-player2Points==1))
		{
			return "advantage player 1";
		}
		if((player1Points>=3&&player2Points>=3) && (player2Points-player1Points==1))
		{
			return "advantage player 2";
		}
		if(player2Points>=4 && player2Points-player1Points>=2)
		{
			checkGameEnded();
			if(gameEnded)
			{
				return "game player 2";
			}
		}
		if(player1Points>=4 && player1Points-player2Points>=2)
		{
			checkGameEnded();
			if(gameEnded)
			{
				return "game player 1";
			}
		}
		
		return "";
	}
	private void checkGameEnded() {
		
		if(player2Points>=4 && player2Points-player1Points>=2)
		{
			gameEnded=true;
		
		}else if(player1Points>=4 && player1Points-player2Points>=2)
		{
			gameEnded=true;
			
		}else{
			
			gameEnded=false;
		}
		
		
	}
	public String getScore(int n){
		
		if(n==0)
		{
			return "0";
		}
		
		if(n==1)
		{
			return "15";
		}
		if(n==2)
		{
			return "30";
		}
		if(n==3)
		{
			return "40";
		}
		
		return null;
	}
	
	

}
