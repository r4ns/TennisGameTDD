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
	public void test_playerOneLeadsBy15() throws TennisGameException {
		TennisGame game = new TennisGame();		
		game.playerOneScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 0", score);	
	}
	
	@Test
	public void test_playerOneLeadsBy30() throws TennisGameException {
		TennisGame game = new TennisGame();		
		game.playerOneScored();
		game.playerOneScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "30 - 0", score);	
	}
	
	@Test
	public void test_playerOneLeadsBy40() throws TennisGameException {
		TennisGame game = new TennisGame();		
		game.playerOneScored();
		game.playerOneScored();
		game.playerOneScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "40 - 0", score);	
	}
	@Test
	public void test_playerTwoLeadsBy15() throws TennisGameException {
		TennisGame game = new TennisGame();		
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 15", score);	
	}
	@Test
	public void test_playerTwoLeadsBy30() throws TennisGameException {
		TennisGame game = new TennisGame();		
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 30", score);	
	}
	@Test
	public void test_playerTwoLeadsBy40() throws TennisGameException {
		TennisGame game = new TennisGame();		
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "0 - 40", score);	
	}
	@Test
	public void test_playerOne15PlayerTwo15() throws TennisGameException {
		TennisGame game = new TennisGame();		
		game.playerTwoScored();
		game.playerOneScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 15", score);	
	}
	@Test
	public void test_playerOne30PlayerTwo15() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerTwoScored();
		game.playerOneScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "30 - 15", score);	
	}
	@Test
	public void test_playerOne40PlayerTwo15() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerTwoScored();
		game.playerOneScored();
		game.playerOneScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "40 - 15", score);	
	}
	@Test
	public void test_playerOne15PlayerTwo30() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 30", score);	
	}
	@Test
	public void test_playerOne15PlayerTwo40() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "15 - 40", score);	
	}
	@Test
	public void test_playerOne30PlayerTwo40() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerOneScored();
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "30 - 40", score);	
	}
	@Test
	public void test_playerOne40PlayerTwo30() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerOneScored();
		game.playerOneScored();
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "40 - 30", score);	
	}
	@Test
	public void test_deuce() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerOneScored();
		game.playerOneScored();
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "deuce", score);	
	}
	@Test
	public void test_playerOneAdvantage() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerOneScored();
		game.playerTwoScored();
		game.playerOneScored();
		game.playerOneScored();
		
		
		
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "advantage player 1", score);	
	}
	@Test
	public void test_playerTwoAdvantage() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerOneScored();
		game.playerOneScored();
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "advantage player 2", score);	
	}
	@Test
	public void test_gameEnded1() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerOneScored();
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerTwoScored();
		game.playerTwoScored();
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "game player 2", score);	
	}
	@Test
	public void test_gameEnded2() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerOneScored();
		game.playerTwoScored();
		game.playerOneScored();
		game.playerOneScored();
		
		String score = game.getScore() ;
		
		assertEquals("Initial score incorrect", "game player 1", score);	
	}
	
	@Test(expected=TennisGameException.class)
	public void testException() throws TennisGameException {
		TennisGame game = new TennisGame();	
		game.playerOneScored();
		game.playerOneScored();
		
		game.playerTwoScored();
		
		game.playerOneScored();
		game.playerOneScored();
		
		game.playerTwoScored();
		
		game.playerOneScored();
		
		game.playerTwoScored();
		game.getScore();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
