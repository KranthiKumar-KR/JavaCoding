package generics;

//import java.util.*;

public class Main {
//private static ArrayList<Team<NBAPlayer>> NBAteams = new ArrayList<> ();
//private static ArrayList<Team<FootballPlayer>> FBteams = new ArrayList<> ();
//private static ArrayList<Team<BaseballPlayer>> BBteams = new ArrayList<> ();
//
	public static void main(String[] args) {
		League<Team<BaseballPlayer>> mlb = new League<>("MLB");
		Team<BaseballPlayer> stl = new Team<>("cardinals");
		Team<BaseballPlayer> chg = new Team<>("chicago cubs");
		Team<BaseballPlayer> dal = new Team<>("dallas cowboys");
		mlb.addToLeague(stl);
		mlb.addToLeague(chg);
		mlb.addToLeague(dal);
		
		//mlb.leagueList();
		
		stl.matchResult(dal, 23, 21);
		stl.matchResult(chg, 33, 32);
		stl.matchResult(dal, 23, 23);
		stl.matchResult(chg, 31, 32);
		
		dal.matchResult(chg, 33, 32);
		dal.matchResult(chg, 31, 32);
		
		mlb.leagueList();
		
		League<Team<NBAPlayer>> nba = new League<>("NBA");
		Team<NBAPlayer> atl = new Team<>("Georgia gaints");
		Team<NBAPlayer> ct = new Team<>("Connecticut heros");
		Team<NBAPlayer> nj = new Team<>("Eastern gaints");
		nba.addToLeague(atl);
		nba.addToLeague(ct);
		nba.addToLeague(nj);
		
		//nba.leagueList();
		
		atl.matchResult(ct, 23, 21);
		atl.matchResult(nj, 33, 32);
		atl.matchResult(ct, 23, 23);
		atl.matchResult(nj, 31, 32);
		
		ct.matchResult(nj, 33, 32);
		ct.matchResult(nj, 31, 32);
		
		nba.leagueList();
		
		League<Team<FootballPlayer>> nfl = new League<>("NFL");
		Team<FootballPlayer> clf = new Team<>("california claws");
		Team<FootballPlayer> cld = new Team<>("colorado highs");
		Team<FootballPlayer> kns = new Team<>("Kansas kings");
		nfl.addToLeague(clf);
		nfl.addToLeague(cld);
		nfl.addToLeague(kns);
		
		//nfl.leagueList();
		
		kns.matchResult(clf, 23, 21);
		kns.matchResult(cld, 33, 32);
		kns.matchResult(clf, 23, 23);
		kns.matchResult(cld, 31, 32);
		
		cld.matchResult(clf, 33, 32);
		cld.matchResult(clf, 31, 32);
		
		nfl.leagueList();
		
		
		
		
		
		
//		Team<NBAPlayer> chicagoBears = new Team<> ("chicago bears");
//		NBAPlayer player = new NBAPlayer("rocky");
//		chicagoBears.addPlayer(player);
//		
//		NBAPlayer player2 = new NBAPlayer("jimmy");
//		chicagoBears.addPlayer(player2);
//		
//		NBAPlayer player3 = new NBAPlayer("jacky");
//		chicagoBears.addPlayer(player3);
//		
//		Team<FootballPlayer> fbteam = new Team<>("Goergia gaints");
//		FootballPlayer fbplayer = new FootballPlayer("jack");
//		fbteam.addPlayer(fbplayer);
//		
//		FootballPlayer fbplayer2 = new FootballPlayer("jim");
//		fbteam.addPlayer(fbplayer2);
//		
//		FootballPlayer fbplayer3 = new FootballPlayer("andrew");
//		fbteam.addPlayer(fbplayer3);
//		
//		Team<BaseballPlayer> bbteam = new Team<>("St.louis cardinals");
//		BaseballPlayer bbplayer = new BaseballPlayer("piscotti");
//		bbteam.addPlayer(bbplayer);		
//		
//		BaseballPlayer bbplayer2 = new BaseballPlayer("pyfer");
//		bbteam.addPlayer(bbplayer2);	
//		
//		BaseballPlayer bbplayer3 = new BaseballPlayer("nork");
//		bbteam.addPlayer(bbplayer3);
//		
//		Team<BaseballPlayer> bbteam2 = new Team<>("St.louis cardinals");
//		BaseballPlayer bb2player = new BaseballPlayer("jp");
//		bbteam.addPlayer(bb2player);		
//		
//		BaseballPlayer bb2player2 = new BaseballPlayer("kp");
//		bbteam.addPlayer(bb2player2);	
//		
//		BaseballPlayer bb2player3 = new BaseballPlayer("ap");
//		bbteam.addPlayer(bb2player3);
//		
//		bbteam.matchResult(bbteam2, 78, 45);
	}
	
//	private static void printTeams(ArrayList<Team<BaseballPlayer>> bBteams2) {
//		ArrayList<Team<BaseballPlayer>> sorted = new ArrayList<Team<BaseballPlayer>>(bBteams2);
//		Collections.sort(sorted);
//		for(Team<BaseballPlayer> team : sorted) {
//			System.out.println(team.getName());
//		}
		
//	}

}
