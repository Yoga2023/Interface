package com.games2;

import com.games.Player;

public class Player2 extends Player implements CricketRules {

	public void playersCount(int e) {
		System.out.println(e + "Players for each team");
	}

	public void tossUpdate(String toss) {
		System.out.println("Toss update:" + toss);
	}

	public void noOfOvers(int f, String overs) {
		System.out.println("Total Overs: " + 10 + overs);
	}

	public void optTo(String opt) {
		System.out.println("Opt to: " + opt);
	}

	public void playTime(float a, String time) {
		System.out.println("Total Hours: " + a + time);
	}

	public void results(String result) {
		System.out.println("RESULT: " + result);
	}

	public static void main(String[] args) {
		Player2 p2 = new Player2();
		System.out.println("Steps for Playing Volleyball match");
		p2.warmup("warmup Started");
		p2.practice(2, "times Practiced");
		p2.playMatches(2);
		p2.warmDown("Warmdown completed");

		System.out.println("Rules for Football:");
		p2.takeFieldWithPlayers(5, "players");
		p2.noSideTackles("follow the rules");
		p2.noOffside("Follow The Rules");
		p2.timesOfPlay("90 minutes of play");

		System.out.println("Cricket rules");
		p2.playersCount(11);
		p2.tossUpdate("teamA wins");
		p2.noOfOvers(10, "Overs");
		p2.optTo("Bat");
		p2.playTime(3, "hours");
		p2.results("Team B Wins");
	}
}
