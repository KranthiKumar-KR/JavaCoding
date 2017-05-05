package oopsProject1;

public class DeluxeBerger extends Burger{
	
	String chips;
	double chipsPrice;
	
	String drink;
	double drinkPrice;
	
	public DeluxeBerger() {
		super("Deluxe burger", "white bread", "Sausage & Beacon", 14.50);
		super.addingTopping1("chips", 1.50);
		super.addingTopping2("Coke", 2.50);
	}

	@Override
	public void addingTopping1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("cannot add aditional topping to delux burger");
	}

	@Override
	public void addingTopping2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("cannot add aditional topping to delux burger");
	}

	@Override
	public void addingTopping3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("cannot add aditional topping to delux burger");
	}

	@Override
	public void addingTopping4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("cannot add aditional topping to delux burger");
	}
	
	

}
