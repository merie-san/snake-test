package com.minigames.snake_test;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class RockPaperScissorsTest {

	@Test
	public void testZeroPlayer() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play()).isEqualTo(null);
	}

	@Test
	public void testOnePlayer() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.SCISSORS)).isEqualTo(null);
		assertThat(game.play(Play.PAPER)).isEqualTo(null);
		assertThat(game.play(Play.ROCK)).isEqualTo(null);
	}

	@Test
	public void test2PScissorsWinsAgainstPaper() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.SCISSORS, Play.PAPER)).isEqualTo(Play.PAPER);
		assertThat(game.play(Play.PAPER, Play.SCISSORS)).isEqualTo(Play.PAPER);
	}

	@Test
	public void test2PPaperWinsAgainstRock() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.ROCK, Play.PAPER)).isEqualTo(Play.ROCK);
		assertThat(game.play(Play.PAPER, Play.ROCK)).isEqualTo(Play.ROCK);
	}

	@Test
	public void test2PRockWinsAgainstScissors() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.ROCK, Play.SCISSORS)).isEqualTo(Play.SCISSORS);
		assertThat(game.play(Play.SCISSORS, Play.ROCK)).isEqualTo(Play.SCISSORS);
	}

	@Test
	public void test2PDraws() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.SCISSORS, Play.SCISSORS)).isEqualTo(null);
		assertThat(game.play(Play.PAPER, Play.PAPER)).isEqualTo(null);
		assertThat(game.play(Play.ROCK, Play.ROCK)).isEqualTo(null);
	}

	@Test
	public void test3PScissorsWins() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.PAPER, Play.SCISSORS, Play.SCISSORS)).isEqualTo(Play.PAPER);
		assertThat(game.play(Play.SCISSORS, Play.PAPER, Play.SCISSORS)).isEqualTo(Play.PAPER);
		assertThat(game.play(Play.SCISSORS, Play.SCISSORS, Play.PAPER)).isEqualTo(Play.PAPER);
		assertThat(game.play(Play.SCISSORS, Play.PAPER, Play.PAPER)).isEqualTo(Play.PAPER);
		assertThat(game.play(Play.PAPER, Play.SCISSORS, Play.PAPER)).isEqualTo(Play.PAPER);
		assertThat(game.play(Play.PAPER, Play.PAPER, Play.SCISSORS)).isEqualTo(Play.PAPER);

	}

	@Test
	public void test3PPaperWins() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.ROCK, Play.PAPER, Play.PAPER)).isEqualTo(Play.ROCK);
		assertThat(game.play(Play.PAPER, Play.ROCK, Play.PAPER)).isEqualTo(Play.ROCK);
		assertThat(game.play(Play.PAPER, Play.PAPER, Play.ROCK)).isEqualTo(Play.ROCK);
		assertThat(game.play(Play.PAPER, Play.ROCK, Play.ROCK)).isEqualTo(Play.ROCK);
		assertThat(game.play(Play.ROCK, Play.PAPER, Play.ROCK)).isEqualTo(Play.ROCK);
		assertThat(game.play(Play.ROCK, Play.ROCK, Play.PAPER)).isEqualTo(Play.ROCK);
	}

	@Test
	public void test3PRockWins() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.SCISSORS, Play.ROCK, Play.ROCK)).isEqualTo(Play.SCISSORS);
		assertThat(game.play(Play.ROCK, Play.SCISSORS, Play.ROCK)).isEqualTo(Play.SCISSORS);
		assertThat(game.play(Play.ROCK, Play.ROCK, Play.SCISSORS)).isEqualTo(Play.SCISSORS);
		assertThat(game.play(Play.ROCK, Play.SCISSORS, Play.SCISSORS)).isEqualTo(Play.SCISSORS);
		assertThat(game.play(Play.SCISSORS, Play.ROCK, Play.SCISSORS)).isEqualTo(Play.SCISSORS);
		assertThat(game.play(Play.SCISSORS, Play.SCISSORS, Play.ROCK)).isEqualTo(Play.SCISSORS);
	}

	@Test
	public void test3PDraws() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertThat(game.play(Play.SCISSORS, Play.SCISSORS, Play.SCISSORS)).isEqualTo(null);
		assertThat(game.play(Play.PAPER, Play.PAPER, Play.PAPER)).isEqualTo(null);
		assertThat(game.play(Play.ROCK, Play.ROCK, Play.ROCK)).isEqualTo(null);
		assertThat(game.play(Play.ROCK, Play.PAPER, Play.SCISSORS)).isEqualTo(null);
		assertThat(game.play(Play.PAPER, Play.ROCK, Play.SCISSORS)).isEqualTo(null);
		assertThat(game.play(Play.ROCK, Play.SCISSORS, Play.PAPER)).isEqualTo(null);
		assertThat(game.play(Play.PAPER, Play.SCISSORS, Play.ROCK)).isEqualTo(null);
		assertThat(game.play(Play.SCISSORS, Play.PAPER, Play.ROCK)).isEqualTo(null);
		assertThat(game.play(Play.SCISSORS, Play.ROCK, Play.PAPER)).isEqualTo(null);
	}

}
