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
	}
	
	public void player1Scored(){
		player1Points++;
	}
	
	public void player2Scored(){
		player2Points++;
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
			return"deuce";
		else
			return "";
		
	}
	
	public String getScore(){
		if(player1Points==0 && player2Points==0){
			return score(player1Points)+" - "+score(player2Points);	
		}
		else if(player1Points==1 && player2Points==0 || player2Points==1 && player1Points==0){
			return score(player1Points)+" - " + score(player2Points);
		}
		else if(player1Points==2 && player2Points==0 || player2Points==2 && player1Points==0){
			return score(player1Points)+" - " + score(player2Points);
		}
		else if(player1Points==3 && player2Points==0 || player2Points==3 && player1Points==0){
			return score(player1Points)+" - " + score(player2Points);
		}
		else if(player1Points==player2Points){
			return score(player1Points)+" - " + score(player2Points);
		}
		else if(player1Points==2 &&player2Points==1 || player2Points==2 &&player1Points==1){
			return score(player1Points)+" - " + score(player2Points);
		}
		else if(player1Points==3 &&player2Points==1 || player2Points==3 &&player1Points==1){
			return score(player1Points)+" - " + score(player2Points);
		}
		else if(player1Points==2 &&player2Points==3 ||player2Points==2 &&player1Points==3){
			return score(player1Points)+" - " + score(player2Points);
		}
		else if(player1Points==3 && player2Points==3){
			return "deuce";
		}
		else
			return "";
	}

	
	

}
