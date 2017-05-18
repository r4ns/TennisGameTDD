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
	public void test_player1ScoredTwicePlayer2DidNotScore() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1scored();
		game.player1scored();
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored twice and player2 didn't score", "30 - 0", score);
	}
	
	@Test
	public void test_15_0() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored once and player2 didn't score", "15 - 0", score);
	}
	@Test
	public void test_40_0() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored three times and player2 didn't score", "40 - 0", score);
	}
	
	@Test
	public void test_0_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 didn't and player2 scored once", "0 - 15", score);
	}
	@Test
	public void test_0_30() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2scored();
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 didn't and player2 scored twice", "0 - 30", score);
	}
	@Test
	public void test_0_40() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 didn't and player2 scored three times", "0 - 40", score);
	}
	@Test 
	public void test_Deuce() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player2scored();
		game.player1scored();
		game.player2scored();
		game.player1scored();
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored three times and player2 scored three times", "deuce", score);
		
	}
	
	@Test
	public void test_AdvantagePlayer1() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		game.player1scored();
		game.player1scored();
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored 4 times and player2 scored 3 times", "advantage player1", score);
	}
	
	@Test
	public void test_AdvantagePlayer2() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		game.player1scored();
		game.player2scored();
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored 3 times and player2 scored 4 times", "advantage player2", score);
	}
	
	@Test
	public void test_player1Won() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored 4 times and player2 didn't score", "player1 won", score);
	}
	
	@Test
	public void test_player2Won() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored 4 times and player2 didn't score", "player2 won", score);
	}
	@Test
	public void test_15_30() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player2scored();
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored once and player2 scored twice", "15 - 30", score);
	}
	
	@Test
	public void test_15_40() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored once and player2 scored three times", "15 - 40", score);
	}
	@Test
	public void test_15_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2scored();
		game.player1scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored once and player2 scored once", "15 - 15", score);
	}
	
	
	@Test
	public void test_ExceptionPlayer2() throws TennisGameException {
		TennisGame game = new TennisGame();
		try{
		game.player2scored();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		game.player2scored();
		
		}
		
		catch(Exception e)
		{
			assertEquals("Incorrect when player2 scored six times and player1 didn't score", "Player2 can't score because game had already ended", e.getMessage());
		}
	
	}
	@Test
	public void test_ExceptionPlayer1() throws TennisGameException {
		TennisGame game = new TennisGame();
		try{
		game.player1scored();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		}
		
		catch(Exception e)
		{
			assertEquals("Incorrect when player1 scored six times and player2 didn't score", "Player1 can't score because game had already ended", e.getMessage());
		}
	
	}
	
	@Test
	public void test_30_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored 2 times and player2 scored once", "30 - 15", score);
	}
	
	@Test
	public void test_40_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored 3 times and player2 scored once", "40 - 15", score);
	}
	
	@Test
	public void test_40_30() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		
		game.player2scored();
		game.player2scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored three times and player2 scored twice", "40 - 30", score);
	}
	

}

