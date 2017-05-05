
public class Main {

	public static void main(String[] args) {
		
		
		
		//Bedroom
	String name = "my bedroom";
		int capacity = 2;
		Walls walls = new Walls(true, "small mirror", true);
		Sealing sealing = new Sealing(true, false, "mini detector");
		Floor floor = new Floor(2, 4, 2, true );
		Windows windows = new Windows(2, 3);
		Dimensions dimensions = new Dimensions(40.0, 80.0, 10.0);
		Bedroom br = new Bedroom(walls, sealing, floor, windows, dimensions, name, capacity);
		br.getName();
		br.getCapacity();
		br.getFloor().isBedReady(2, true);
		br.getFloor().isFloorSet(true, false);
		br.getSealing().sealingState("grean");
		br.getWalls().wallsState(true, true);
		br.getWindows().windowState("panes", true); 
		
		
		//college

/*Department dept = new Department("3", "ECE", 35, 5, "electric block", 45);
Student student = new Student("kranthi", "486", 45, "maths", dept);
student.getDepartment().calCond(0);
student.isPassed();
student.getDepartment().studFacRatio(35, 5);*/
	}

}
