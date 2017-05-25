package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.TennisGame;
import main.TennisGameException;

// Testing of midgame scores before both players score three times
public class NumericScores {

	@Test
	public void test_pocetakMeca() {
		TennisGame game = new TennisGame();
		String score = game.getScore() ;
		assertEquals("0 - 0", score);	
	}
	
	@Test
	public void test_Score15_0() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		String score = game.getScore() ;
		assertEquals("15 - 0", score);	
	}
	
	@Test
	public void test_Score30_0() throws TennisGameException {
		TennisGame game = new TennisGame();		
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;
		assertEquals("30 - 0", score);	
	}
	
	@Test
	public void test_Score40_0() throws TennisGameException {
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		String score = game.getScore() ;
		assertEquals("40 - 0", score);	
	}
	
	@Test
	public void test_p2Wins1Point_Score0_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player2 scored once", "0 - 15", score);	
	}
	
	@Test
	public void test_Score0_30() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;
		assertEquals("0 - 30", score);	
	}
	
	@Test
	public void test_Score0_40() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("0 - 40", score);	
	}
	
	@Test
	public void test_Score15_15() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("15 - 15", score);	
	}
	
	@Test
	public void test_Score30_30() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player1Scored();		
		game.player2Scored();
		game.player1Scored();		
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("30 - 30", score);	
	}
	
	@Test
	public void test_Score30_15() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		String score = game.getScore() ;

		assertEquals("30 - 15", score);	
	}

	@Test
	public void test_Score40_15() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();	
		String score = game.getScore() ;

		assertEquals("40 - 15", score);	
	}
	
	@Test
	public void test_Score15_30() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("15 - 30", score);	
	}
	
	@Test
	public void test_p1Wins1Point_p2Wins3Point_Score15_40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("15 - 40", score);	
	}
	
	@Test
	public void test_Score30_40() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String score = game.getScore() ;

		assertEquals("30 - 40", score);	
	}
	
	@Test
	public void test_Score40_30() throws TennisGameException {
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice", "40 - 30", score);	
	}
	
	@Test
	public void test_deuce() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect deuce score", "deuce", score);
	}
	
	@Test
	public void test_advantage1() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Invorrect advantage score", "advantage igrac 1", score);
	}
	
	@Test
	public void test_advantage2() throws TennisGameException
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
		
		assertEquals("Invorrect advantage score", "advantage igrac 2", score);
	}
	
	@Test
	public void test_pobedjujeIgrac1() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect advantage score", "pobedjuje igrac 1", score);
	}
	
	@Test
	public void test_pobedjujeIgrac2() throws TennisGameException
	{
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore();
		
		assertEquals("Incorrect advantage score", "pobedjuje igrac 2", score);
	}
}

