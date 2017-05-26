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
	public void test_player1_1p_player2_0p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 0", score);
	}
	
	@Test
	public void test_player1_2p_player2_0p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 0", score);
	}
	
	@Test
	public void test_player1_3p_player2_0p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 0", score);
	}
	
	@Test
	public void test_player1_0p_player2_1p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 15", score);
	}
	
	@Test
	public void test_player1_0p_player2_2p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 30", score);
	}
	
	@Test
	public void test_player1_0p_player2_3p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "0 - 40", score);
	}
	
	@Test
	public void test_player1_1p_player2_1p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 15", score);
	}
	
	@Test
	public void test_player1_2p_player2_5p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 15", score);
	}
	
	@Test
	public void test_player1_3p_player2_1p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 15", score);
	}
	
	@Test
	public void test_player1_1p_player2_2p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	
	@Test
	public void test_player1_1p_player2_3p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	
	@Test
	public void test_player1_2p_player2_3p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "30 - 40", score);
	}
	
	@Test
	public void test_player1_3p_player2_2p() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "40 - 30", score);
	}
	
	@Test
	public void test_player1_3p_player2_3p_deuce() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "deuce", score);
	}
	
	@Test
	public void test_player1_adventage() throws TennisGameException
	{
		TennisGame game = new TennisGame(); 
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "adventage player1", score);
	}
	
	@Test
	public void test_player2_adventage() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "adventage player2", score);
	}
	
	@Test
	public void test_player1_game() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "game player1", score);
	}
	
	@Test
	public void test_player2_game() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Initial score incorrect", "game player2", score);
	}
	
	@Test(expected = TennisGameException.class)
	public void test_player1_5p_player2_2p_exception() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
	}
	
	@Test(expected = TennisGameException.class)
	public void test_player1_1p_player2_6p_exception() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
	}
}
