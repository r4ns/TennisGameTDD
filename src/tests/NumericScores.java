package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {

	
	@Test
	public void test_StartScore() {
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_p1Wins1Point_Score15_0() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	@Test
	public void test_p1Wins2Point_Score30_0() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	@Test
	public void test_p1Wins3Point_Score40_0() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	@Test
	public void test_p2Wins1Point_Score0_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	@Test
	public void test_p2Wins2Point_Score0_30() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	@Test
	public void test_p2Wins3Point_Score0_40() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	@Test
	public void test_p1Wins1Point_p2Wins1Point_Score15_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 15", score);
	}
	@Test
	public void test_p1Wins2Point_p2Wins1Point_Score30_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 15", score);
	}
	@Test
	public void test_p1Wins3Point_p2Wins1Point_Score40_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 15", score);
	}
	@Test
	public void test_p1Wins1Point_p2Wins2Point_Score15_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	@Test
	public void test_p1Wins1Point_p2Wins3Point_Score15_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	@Test
	public void test_p1Wins2Point_p2Wins3Point_Score30_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "30 - 40", score);
	}
	@Test
	public void test_p1Wins3Point_p2Wins2Point_Score40_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "40 - 30", score);
	}
	@Test
	public void test_ScoreDeuce() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "deuce", score);
	}
	@Test
	public void test_ScoreAdvantage1()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "player1 advantage", score);
	}
	@Test
	public void test_ScoreAdvantage2()  throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "player2 advantage", score);
	}
	@Test
	public void test_Player1Win() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "win player1", score);	
	}
	
	@Test
	public void test_Player2Win() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "win player2", score);	
	}
	
	@Test (expected=TennisGameException.class)
	public void test_Score_Ex1() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
	}
	
	@Test (expected=TennisGameException.class)
	public void test_Score_Ex2() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
	}
	
}
