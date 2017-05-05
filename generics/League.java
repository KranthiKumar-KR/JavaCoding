package generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<?>> {
	private String name;
	
	private ArrayList<T> leagues = new ArrayList<> ();
	public League(String name) {
		this.name = name;
	}
	
	public boolean addToLeague(T team) {
		if(leagues.contains(team)) {
			return false;
		}
		leagues.add(team);
		return true;
	}
	
	public void leagueList(){
		int i =1;
		Collections.sort(leagues);
		for(T team: leagues) {
			System.out.println("\n" +i+ ". " + team.getName() + ", :score " +team.ranking() );
			i++;
		}
		System.out.println();
	}

	public String getName() {
		return name;
	}

}
