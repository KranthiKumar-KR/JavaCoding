package polymorphism;

public class Car {
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;

	public Car(String name, int cylinderCount) {
		this.name = name;
		this.cylinders = cylinderCount;
		this.engine = true;
		this.wheels = 4;

	}

	public boolean startEngine() {

		return true;
	}

	public boolean accelerate() {
		return true;
	}

	public boolean brake() {

		return true;
	}

	public boolean setCylinders(int count) {
		this.cylinders = count;
		return true;
	}

	public int getCylinders() {
		return cylinders;
	}

	public boolean setWheels(int wheels) {
		this.wheels = wheels;
		return true;
	}

	public int getWheels() {
		return wheels;
	}
}
