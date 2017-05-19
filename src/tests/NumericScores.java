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
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_Player1_15_Player2_0() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "15 - 0", score);
	}
	
	@Test
	public void test_Player1_30_Player2_0() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "30 - 0", score);
	}
	
	@Test
	public void test_Player1_40_Player2_0() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "40 - 0", score);
	}
	
	@Test
	public void test_Player1_0_Player2_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 15", score);
	}
	
	@Test
	public void test_Player1_0_Player2_30() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 30", score);
	}
	
	@Test
	public void test_Player1_0_Player2_40() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "0 - 40", score);
	}	
	
	@Test
	public void test_Player1_15_Player2_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "15 - 15", score);
	}
	
	@Test
	public void test_Player1_30_Player2_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "30 - 15", score);
	}
	
	@Test
	public void test_Player1_40_Player2_15() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "40 - 15", score);
	}
	
	@Test
	public void test_Player1_15_Player2_30() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "15 - 30", score);
	}
	
	@Test
	public void test_Player1_15_Player2_40() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "15 - 40", score);
	}
	
	@Test
	public void test_Player1_30_Player2_30() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "30 - 30", score);
	}
	
	@Test
	public void test_Deuce() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "deuce", score);
	}
	
	@Test
	public void test_Player1_Advantage() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "advantage igrac1", score);
	}
	
	@Test
	public void test_Player1_Win() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore();

		assertEquals("Initial score incorrect", "pobedjuje igrac1", score);
	}
	
	@Test(expected = TennisGameException.class)
	public void test_Player1_Win_ScoreOneMoreTime() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
	}

}
