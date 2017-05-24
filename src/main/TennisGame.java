package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points = 0;
		this.player2Points = 0;
		this.gameEnded = false;
	}

	public String getScore(int point)
	{
		if(point == 1)
		{
			return "15";
		}
		else if(point == 2)
		{
			return "30";
		}
		else if(point == 3)
		{
			return "40";
		}
		else{
			return "0";
		}
	}
	public String getScore()
	{
		if(player1Points <= 2 || player2Points <=2){
			return getScore(player1Points) + " - " + getScore(player2Points);
			}else if (player1Points == player2Points){
				return "deuce";
			}else if (player1Points == player2Points + 1){
				return "player1 advantage";
			}else if (player1Points + 1== player2Points){
				return "player2 advantage";
			}else if (player1Points == player2Points + 2){
				return "win player1";
			}else if (player1Points + 2== player2Points){
				return "win player2";
			}
			return "";

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
}
