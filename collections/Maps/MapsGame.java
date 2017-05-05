package collections.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapsGame {

	private static Map<Integer, Location> locations = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> tempExits = new HashMap<String, Integer>();
		tempExits.put("N", 5);
		tempExits.put("W", 2);
		tempExits.put("S", 4);
		tempExits.put("E", 3);
		locations.put(1, new Location(1, "you are at the main road", tempExits));

		tempExits = new HashMap<String, Integer>();
		tempExits.put("N", 5);
		locations.put(2, new Location(2, "you on the top of the hill", tempExits));

		tempExits = new HashMap<String, Integer>();
		tempExits.put("W", 1);
		locations.put(3, new Location(3, "you are inside the building", tempExits));

		tempExits = new HashMap<String, Integer>();
		tempExits.put("N", 1);
		tempExits.put("W", 2);
		locations.put(4, new Location(4, "you are in the valley", tempExits));

		tempExits = new HashMap<String, Integer>();
		tempExits.put("S", 1);
		tempExits.put("W", 2);
		locations.put(5, new Location(5, "you are in the woods", tempExits));

		int loc = 1;
		while (true) {

			System.out.println(locations.get(loc).getLocationDescription());

			if (loc == 0) {
				System.out.println("you are in your room, Please come out of the living room");
				break;
			}

			System.out.println("available directions are: ");

			Map<String, Integer> exits = locations.get(loc).getExits();
			for (String location : exits.keySet()) {
				System.out.print(location + ", ");
			}

			System.out.println();
			String nextMove = sc.nextLine().toUpperCase();

			String[] moves = nextMove.split(" ");
			Vocabulory voc = new Vocabulory();

			for (String move : moves) {
				try {
					if (voc.getWords().containsKey(move)) {

						loc = exits.get(voc.getWords().get(move));
						break;
					} else if(exits.containsKey(move)) {
						loc = exits.get(move);
					} 
				} catch (Exception e) {
					System.out.println("that direction is not available");
				}
			}
		}

	}

}
