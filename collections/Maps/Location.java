package collections.Maps;

import java.util.HashMap;
import java.util.Map;

public final class Location {
	private final int locationId;
	private final String locationDescription;
	private final Map<String, Integer> exits;

	public Location(int locationId, String locationDescription, Map<String, Integer> exits) {
		this.locationId = locationId;
		this.locationDescription = locationDescription;
		if(exits!=null){
			this.exits = new HashMap<>(exits);
		} else {
		this.exits = new HashMap<>();
		}
		exits.put("Q", 0);
	}

	public int getLocationId() {
		return locationId;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<>(exits);
	}

}
