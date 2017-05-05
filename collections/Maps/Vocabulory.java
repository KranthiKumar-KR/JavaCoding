package collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class Vocabulory {
	
	private Map<String, String> words;

	public Vocabulory() {
		super();
		this.words = new HashMap<String, String>();
		this.words.put("WEST", "W");
		this.words.put("NORTH", "N");
		this.words.put("SOUTH", "S");
		this.words.put("EAST", "E");
	}
	public Map<String, String> getWords() {
		return new HashMap<String, String> (words);
	}

}
