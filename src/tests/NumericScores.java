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
	public void test_Player1Points15_Player2Points0()  throws TennisGameException
	{
		TennisGame game= new TennisGame();
		game.player1scored();
		String score=game.getScore();
		
		assertEquals("Score incorrect", "15 - 0", score);	
	}
	
	@Test 
	public void test_PLayer1Points30_PLayer2Points0()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		
		String score=game.getScore();
		assertEquals("Score incorrect", "30 - 0", score);
		
	}
	
	@Test 
	public void test_Player1Points40_Player2Points0()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		String score= game.getScore();
		
		assertEquals("Score incorrect", "40 - 0", score);
	}
	
	@Test 
	public void test_Player1Points0_Player2Points15()  throws TennisGameException
	{
		TennisGame game= new TennisGame();
		game.player2scored();
		
		String score=game.getScore();
		assertEquals("Score incorrect", "0 - 15", score);
	}
	
	@Test
	public void test_Player1Points0_Player2Points30()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2scored();
		game.player2scored();
		
		String score=game.getScore();
		assertEquals("Score incorrect", "0 - 30", score);
	}
	
	@Test 
	public void test_Player1Points0_Player2Points40()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		String score=game.getScore();
		assertEquals("Score incorrect", "0 - 40", score);
	}
	
	@Test
	public void test_Player1Points15_Player2Points15()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player2scored();
		
		String score = game.getScore();
		assertEquals("Score incorrect","15 - 15", score);
	}
	
	@Test 
	public void test_Player1Points30_Player2Points15()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1scored();
		game.player1scored();
		
		game.player2scored();
		
		String score = game.getScore();
		assertEquals("Score incorrect", "30 - 15", score);
	}
	
	@Test 
	public void test_Player1Points40_Player2Points15()  throws TennisGameException
	{
		TennisGame game= new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		game.player2scored();
		
		String score=game.getScore();
		assertEquals("Score incorrect", "40 - 15", score);
	}
	@Test 
	public void test_Player1Points15_Player2Points30()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		
		game.player2scored();
		game.player2scored();
		String score = game.getScore();
		assertEquals("Score incorrect", "15 - 30", score);
	}
	
	@Test
	public void test_Player1Points15_Player2Points40()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		String score=game.getScore();
		assertEquals("Score incorrect", "15 - 40", score);
	}
	
	@Test 
	public void test_Player1Points30_Player2Points40()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		
		
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		String score=game.getScore();
		assertEquals("Score incorrect", "30 - 40", score);
	}
	
	@Test 
	public void test_Player1Points40_Player2Points30()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		
		game.player2scored();
		game.player2scored();
		
		String score=game.getScore();
		assertEquals("Score incorrect", "40 - 30", score);
	}
	
	@Test 
	public void test_Player1Points40_Player2Points40_deuce()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		String score=game.getScore();
		
		assertEquals("Score incorrect", "deuce", score);
	}
	
	@Test 
	public void test_Player1PointsAD_Player2Points40()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		game.player1scored();
		
		String score=game.getScore();
		
		assertEquals("Score incorrect", "advantage player1", score);
	}
	
	@Test 
	public void test_Player1Points40_Player2PointsAD()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		game.player2scored();
		
		String score=game.getScore();
		
		assertEquals("Score incorrect", "advantage player2", score);
	}
	
	@Test 
	public void test_Player1Won_Player2()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1scored();
		game.player1scored();
		
		game.player2scored();
		
		game.player1scored();
		game.player1scored();
		
		
		String score=game.getScore();
		
		assertEquals("Score incorrect", "player1 win", score);
	}
	
	@Test 
	public void test_Player1_Player2Won()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2scored();
		game.player2scored();
		
		game.player1scored();
		
		game.player2scored();
		game.player2scored();
		
		
		String score=game.getScore();
		
		assertEquals("Score incorrect", "player2 win", score);
	}
	
	@Test(expected=TennisGameException.class)
	public void test_bacanjeIzuzetkaPobedioIgrac1()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		
		game.player2scored();
		game.player2scored();
		
		game.player1scored();
		game.player1scored();
		
		game.player1scored();
	}
	@Test(expected=TennisGameException.class)
	public void test_bacanjeIzuzetkaPobedioIgrac2()  throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		
		game.player2scored();
		game.player2scored();
		
		game.player2scored();
		game.player2scored();
		
		game.player1scored();
	}
	
	
	
}
