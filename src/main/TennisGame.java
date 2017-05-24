package main;

public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points=0;
		this.player2Points=0;
		this.gameEnded=false;
	}
	
	public void player2Scored() throws TennisGameException
	{
		End();
		if(gameEnded)
		{
			throw new TennisGameException("Game ended!");
		}
		
		else
		this.player2Points++;
	}
	
	public void player1Scored() throws TennisGameException
	{
		End();
		if(gameEnded)
		{
			throw new TennisGameException("Game ended!");
		}
		else
		this.player1Points++;
	}
	
	public void End(){
		if((this.player1Points>=4 && this.player1Points-this.player2Points>=2) || (this.player2Points>=4 && this.player2Points-this.player1Points>=2))
		{
			gameEnded=true;
		}
	}
	public String score(int points)
	{
		String convPoints="0";
		if(points==1)
		{
			convPoints="15";
		}
		else if(points==2)
		{
			convPoints="30";
		}
		else if(points==3)
		{
			convPoints="40";
		}
		return convPoints;
	}
	public String getScore(){
		
		String igrac1=score(this.player1Points);
		String igrac2=score(this.player2Points);
		String rez="";
		End();
		if(!gameEnded)
		{
			if(this.player1Points>3 && this.player2Points<=3)
			{
				rez="advantage 1";
			}
			else if(this.player2Points>3 && this.player1Points<=3)
			{
				rez="advantage 2";
			}
			else if(igrac1.equals("40") && igrac2.equals("40"))
			{
				rez="deuce";
			}
			else if(this.player1Points==4 && this.player2Points==4)
			{
				this.player1Points--;
				this.player2Points--;
				rez="deuce";
			}
			else
			rez= igrac1+ " - "+ igrac2;
		}
			else if(gameEnded)
			{
				if(this.player1Points>this.player2Points)
				{
					rez="player1 wins";
				}
				else
					rez="player2 wins";
			}
		return rez; 
		
	}

}
