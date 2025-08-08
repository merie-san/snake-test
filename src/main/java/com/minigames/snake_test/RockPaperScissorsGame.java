package com.minigames.snake_test;

public class RockPaperScissorsGame {

	public Play compare(Play play1, Play play2) {
		if ((play1==Play.SCISSORS||play2==Play.SCISSORS)&&play1!=Play.ROCK&&play2!=Play.ROCK) {
			return Play.SCISSORS;
		} else if ((play1==Play.PAPER||play2==Play.PAPER)&&play1!=Play.SCISSORS&&play2!=Play.SCISSORS){
			return Play.PAPER;
		} else return Play.ROCK;
	}

}
