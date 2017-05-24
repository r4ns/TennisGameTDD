package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {
	
	TennisGame game;

	
	@Test
	public void test_StartScore() {
		game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_Score15_0() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored one time", "15 - 0", score);
	}
	
	@Test
	public void test_Score30_0() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored two time", "30 - 0", score);
	}
	
	@Test
	public void test_Score40_0() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored three time", "40 - 0", score);
	}
	@Test
	public void test_Score0_15() throws TennisGameException{
		game=new TennisGame();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored one time", "0 - 15", score);
	}
	
	@Test
	public void test_Score0_30() throws TennisGameException{
		game=new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored two time", "0 - 30", score);
	}
	@Test
	public void test_Score0_40() throws TennisGameException{
		game=new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored three time", "0 - 40", score);
	}
	
	@Test
	public void test_Score15_15() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 and player two scored one time", "15 - 15", score);
	}
	@Test
	public void test_Score30_15() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored two and player two scored one time", "30 - 15", score);
	}
	@Test
	public void test_Score40_15() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 1 scored three and player two scored one time", "40 - 15", score);
	}
	@Test
	public void test_Score15_30() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored two and player two scored one time", "15 - 30", score);
	}
	@Test
	public void test_Score15_40() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored three and player two scored one time", "15 - 40", score);
	}
	@Test
	public void test_Score30_40() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("Player 2 scored three and player two scored two time", "30 - 40", score);
	}
	@Test
	public void test_Score40_30() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("", "40 - 30", score);
	}
	@Test
	public void test_Deuce() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("", "deuce", score);
	}
	@Test
	public void test_AdvantagePlayer1() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("", "advantage player 1", score);
	}
	@Test
	public void test_AdvantagePlayer2() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("", "advantage player 2", score);
	}
	@Test
	public void test_GamePlayer2() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score=game.getScore();
		
		assertEquals("", "game player 2", score);
	}
	@Test
	public void test_GamePlayer1() throws TennisGameException{
		game=new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score=game.getScore();
		
		assertEquals("", "game player 1", score);
	}
	@Test (expected=TennisGameException.class)
	public void test_GameEnded_Player1Scored() throws TennisGameException{
		game=new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
	}
	@Test (expected=TennisGameException.class)
	public void test_GameEnded_Player2Scored() throws TennisGameException{
		game=new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
	}
	

}
