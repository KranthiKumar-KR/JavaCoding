package collections.SetsandHashsets;
import java.util.*;
public  class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	private final BodyTypes bodyType;
	private final Set<HeavenlyBody> satelites;
	public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
		super();
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.bodyType = bodyType;
		this.satelites = new HashSet<> ();
	}
	enum BodyTypes {
		STAR,
		PLANET,
		SATELLITE,
		DWARF_PLANET,
		COMET,
		ASTEROID;
	}
	public void addMoon(HeavenlyBody body) {
		this.satelites.add(body);
	}
	public String getName() {
		return name;
	}
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	public Set<HeavenlyBody> getSatelites() {
		return new HashSet<> (satelites);
	}
	public BodyTypes getBodyType() {
		return bodyType;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody) obj;
			if(this.name.equals(theObject.getName())) {
	
				return this.bodyType == theObject.getBodyType();
				
			}
		}
		return false;
			
	}
	

}
