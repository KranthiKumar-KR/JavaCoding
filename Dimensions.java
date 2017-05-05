
public class Dimensions {
	private double length;
	private double width;
	private double height;
	public Dimensions(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		inSquareFeet();
	}
	public void inSquareFeet() {
		double area = length*width;
		double sqrArea = Math.sqrt(area);
		System.out.println("Total room area is: " +Math.round(sqrArea) +" square feets");
	}

}
