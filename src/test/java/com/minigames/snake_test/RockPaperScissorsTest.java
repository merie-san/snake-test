package com.minigames.snake_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;


public class RockPaperScissorsTest {

	@Test
	public void testScissorsWinsAgainstPaper() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.compare(Play.SCISSORS, Play.PAPER)).isEqualTo(Play.SCISSORS);
		assertThat(game.compare(Play.PAPER, Play.SCISSORS)).isEqualTo(Play.SCISSORS);
	}

	@Test
	public void testPaperWinsAgainstRock() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.compare(Play.ROCK, Play.PAPER)).isEqualTo(Play.PAPER);
		assertThat(game.compare(Play.PAPER, Play.ROCK)).isEqualTo(Play.PAPER);
	}

	@Test
	public void testRockWinsAgainstScissors() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.compare(Play.ROCK, Play.SCISSORS)).isEqualTo(Play.ROCK);
		assertThat(game.compare(Play.SCISSORS, Play.ROCK)).isEqualTo(Play.ROCK);
	}

	@Test
	public void testDraws() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.compare(Play.SCISSORS, Play.SCISSORS)).isEqualTo(Play.SCISSORS);
		assertThat(game.compare(Play.PAPER, Play.PAPER)).isEqualTo(Play.PAPER);
		assertThat(game.compare(Play.ROCK, Play.ROCK)).isEqualTo(Play.ROCK);
	}

}
