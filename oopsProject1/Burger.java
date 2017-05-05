package oopsProject1;

public class Burger {
	private String name;
	private String breadType;
	private String meat;
	private double price;
	
	public Burger(String name, String breadName, String meat, double price){
		this.name = name;
		this.breadType = breadName;
		this.meat = meat;
		this.price = price;
	}
	
	private String topping1;
	private double topping1Price;
	
	private String topping2;
	private double topping2Price;

	private String topping3;
	private double topping3Price;

	private String topping4;
	private double topping4Price;


public void addingTopping1(String name, double price){
	this.topping1Price = price;
	this.topping1 = name;
}

public void addingTopping2(String name, double price){
	this.topping2Price = price;
	this.topping2 = name;
}

public void addingTopping3(String name, double price){
	this.topping3Price = price;
	this.topping3 = name;
}

public void addingTopping4(String name, double price){
	this.topping4Price = price;
	this.topping4 = name;
}

public double finishOrder() {
	double HambergerPrice = this.price;
	System.out.println( name + "berger with bread type " +breadType + " has been ordered " + "price is: " +HambergerPrice);
	if(this.topping1!=null){
		HambergerPrice += topping1Price;
		System.out.println(this.topping1 + "  has been added for $" +this.topping1Price);
	}
	if(this.topping2!=null){
		HambergerPrice += topping2Price;
		System.out.println(this.topping2 + "  has been added for $" +this.topping2Price);
	}
	if(this.topping3!=null){
		HambergerPrice += topping3Price;
		System.out.println(this.topping3 + "  has been added for $" +this.topping3Price);
	}
	if(this.topping4!=null){
		HambergerPrice += topping4Price;
		System.out.println(this.topping4 + "  has been added for $" +this.topping4Price);
	}
	
	return HambergerPrice;
		
}

}
