package generics;

import java.util.*;

public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	private int won = 0;
	private int lost = 0;
	private int tied = 0;
	private int played = 0;

	private ArrayList<T> players;

	public Team(String name) {
		this.name = name;
		players = new ArrayList<>();
		// System.out.println( "Team [name=" + name + "]" + " has been
		// created");
	}

	public String getName() {
		return name;
	}

	public ArrayList<T> getPlayers() {
		return players;
	}

	public boolean addPlayer(T player) {
		if (player != null) {
			if (players.contains(player)) {
				System.out.println("player " + player.getName() + " already exists in the team" + "\n");
				return false;
			} else {
				players.add(player);
				System.out.println("new player " + player.getName() + " has been added to " + name + "\n");
				return true;
			}
		}
		return false;
	}

	public int numPlayers() {
		return players.size();
	}

	public void matchResult(Team<T> opponentTeam, int ourScore, int oppScore) {
		String result;
		if (ourScore > oppScore) {
			won++;
			result = " won on ";
		} else if (ourScore < oppScore) {
			lost++;
			result = " lost to ";
		} else {
			tied++;
			result = " no result with ";
		}
		played++;
		if (opponentTeam != null) {
			System.out.println(
					this.getName() + result + opponentTeam.getName() + " with scores " + ourScore + " & " + oppScore);
			opponentTeam.matchResult(null, oppScore, ourScore);
		}
	}

	public int ranking() {
		return (won * 2) + tied;
	}

	@Override
	public int compareTo(Team<T> o) {
		if (this.ranking() > o.ranking()) {
			return -1;
		} else if (this.ranking() < o.ranking()) {
			return 1;
		} else {
			return 0;
		}

	}

}
