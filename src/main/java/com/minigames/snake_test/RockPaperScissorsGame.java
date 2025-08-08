package com.minigames.snake_test;
public class RockPaperScissorsGame {
	
	/**
	 * Returns the losing play in a game of Rock-Paper-Scissors.
	 * */
	public Play play(Play... plays) {
		int[] playCounts = new int[3];
		for (int i = 0; i < plays.length; i++) {
			if (plays[i] == Play.SCISSORS) {
				playCounts[0]++;
			} else if (plays[i] == Play.PAPER) {
				playCounts[1]++;
			} else {
				playCounts[2]++;
			}
		}
		if (playCounts[0] > 0 && playCounts[1] == 0 && playCounts[2] > 0) {
			return Play.SCISSORS;
		} else if (playCounts[1] > 0 && playCounts[2] == 0 && playCounts[0] > 0) {
			return Play.PAPER;
		} else if (playCounts[2] > 0 && playCounts[0] == 0 && playCounts[1] > 0) {
			return Play.ROCK;
		} else
			return null;
	}

}
