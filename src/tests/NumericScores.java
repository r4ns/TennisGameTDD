package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TennisGameException;
import main.TennisGame;

// Testing of midgame scores before both players score three times
public class NumericScores {

	/*
	@Test
	public void test_StartScore() {
		TennisGame game = new TennisGame();
		String score = game.getScore() ;

		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	*/
	
	public NumericScores(){}

	@Test
	public void test_StartScore() {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_p1Wins1Point_Score15_0() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored once", "15 - 0", score);	
	}
	

	@Test
	public void test_p1Wins2Points_Score30_0() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();		
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored twice", "30 - 0", score);	
	}
	
	@Test
	public void test_p1Wins3Points_Score40_0() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times", "40 - 0", score);	
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
	public void test_p2Wins2Points_Score0_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player2Scored();
		game.player2Scored();
		//Act		
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player2 scored twice", "0 - 30", score);	
	}
	
	@Test
	public void test_p2Wins3Points_Score0_40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when playe2 scored three times", "0 - 40", score);	
	}
	
	@Test
	public void test_p1Wins1Point_p2Wins1Point_Score15_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when each player scored once", "15 - 15", score);	
	}
	
	@Test
	public void test_p1Wins2Points_p2Wins2Points_Score30_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();		
		game.player2Scored();
		game.player1Scored();		
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when each player scored two times", "30 - 30", score);	
	}
	
	@Test
	public void test_p1Wins2Points_p2Wins1Point_Score30_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored twice and player2 scored once", "30 - 15", score);	
	}

	@Test
	public void test_p1Wins3Points_p2Wins1Point_Score40_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();	
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored once", "40 - 15", score);	
	}
	
	@Test
	public void test_p1Wins1Point_p2Wins2Points_Score15_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored once and player2 scored twice", "15 - 30", score);	
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
		assertEquals("Incorrect score when player1 scored once and player2 scored three times", "15 - 40", score);	
	}
	
	@Test
	public void test_p1Wins2Points_p2Wins3Points_Score30_40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored twice and player2 scored three times", "30 - 40", score);	
	}
	
	@Test
	public void test_p1Wins3Points_p2Wins2Points_Score40_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice", "40 - 30", score);	
	}
	
	@Test
	public void test_p1Wins3Points_p2Wins2Points_AlternativeSequenceOfWins_Score40_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice. Players win points alternating.", "40 - 30", score);	
	}
	
	@Test
	public void test_p1Wins3Points_p2Wins3Points_AlternativeSequenceOfWins_Score40_40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice. Players win points alternating.", "deuce", score);	
	}
	
	@Test
	public void test_p1Wins4Points_p2Wins4Points_AlternativeSequenceOfWins_Score_1() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice. Players win points alternating.", "advantage player1", score);	
	}
	
	@Test
	public void test_p1Wins4Points_p2Wins4Points_AlternativeSequenceOfWins_Score_2() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice. Players win points alternating.", "advantage player2", score);	
	}
	
	@Test
	public void test_p1Wins5Points_p2Wins5Points_AlternativeSequenceOfWins_Score_2() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player2Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player1Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice. Players win points alternating.", "deuce", score);	
	}
	
	@Test
	public void test_p1Wins() throws TennisGameException {

		TennisGame game = new TennisGame();

		if(game.pobeda == 1){
			String score = game.getScore() ;
			// Assert
			assertEquals("Incorrect score when player1 scored three times and player2 scored twice. Players win points alternating.", "game player1", score);
		}
	}
	
	@Test
	public void test_p2Wins() throws TennisGameException {

		TennisGame game = new TennisGame();

		if(game.pobeda == 2){
			String score = game.getScore() ;
			// Assert
			assertEquals("Exeption.", "game player2", score);
		}
	}
	

}
