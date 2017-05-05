
public class Bedroom {
	private Walls walls;
	private Sealing sealing;
	private Floor floor;
	private Windows windows;
	private Dimensions dimensions;
	private String name;
	private int capacity;
	public Bedroom(Walls walls, Sealing sealing, Floor floor, Windows windows, Dimensions dimensions, String name,
			int capacity) {
		super();
		this.walls = walls;
		this.sealing = sealing;
		this.floor = floor;
		this.windows = windows;
		this.dimensions = dimensions;
		this.name = name;
		this.capacity = capacity;
	}
	public Walls getWalls() {
		return walls;
	}
	public Sealing getSealing() {
		return sealing;
	}
	public Floor getFloor() {
		return floor;
	}
	public Windows getWindows() {
		return windows;
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	public String getName() {
		System.out.println("name of the bedroom is: " +this.name);
		return name;
	}
	public int getCapacity() {
		System.out.println("capacity of " +name + "is " +this.capacity);
		return capacity;
	}
	
	

}
