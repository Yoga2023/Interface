package com.games;

public  class Player implements FootballRules {
	public void warmup(String name) {
		System.out.println(name);
	}

	public void practice(int a, String name1) {
		System.out.println(a + name1);
	}

	public void playMatches(int b) {
		System.out.println("played Matches=" + b);
	}

	public void warmDown(String name) {
		System.out.println(name);

	}

	public void takeFieldWithPlayers(int d, String name2) {
		System.out.println(d + name2);
	}

	public void noSideTackles(String name3) {
		System.out.println(name3);
	}

	public void noOffside(String name4) {
		System.out.println("No oFF SIDE:" + name4);

	}

	public void timesOfPlay(String time) {
		System.out.println(time);
	}

	/*
	 * public static void main(String[] args) { Player p = new Player();
	 * System.out.println("Steps for Playing Volleyball match");
	 * p.warmup("warmup Started"); p.practice(2, "times Practiced");
	 * p.playMatches(2); p.warmDown("Warmdown completed");
	 * 
	 * System.out.println("Rules for Football:"); p.takeFieldWithPlayers(5,
	 * "players"); p.noSideTackles("follow the rules");
	 * p.noOffside("Follow The Rules"); p.timesOfPlay("90 minutes of play");
	 * 
	 * }
	 */
}
