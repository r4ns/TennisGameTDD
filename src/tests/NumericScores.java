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
	public void test_player1ScoredOncePlayer2DidNotScore() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1scored();
		game.player1scored();
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored twice and player2 didn't score", "30 - 0", score);
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
	public void test_15_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2scored();
		game.player1scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect when player1 scored once and player2 scored once", "15 - 15", score);
	}
	
	

	@Test(expected=TennisGameException.class)
	public void test_player1wonPlayer2Scorespoint() throws TennisGameException{
		
		TennisGame game = new TennisGame();
		
		game.player1scored();
		game.player1scored();
		game.player1scored();
		game.player1scored();
		game.player2scored();

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

