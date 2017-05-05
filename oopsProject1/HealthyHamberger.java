package oopsProject1;

public class HealthyHamberger extends Burger{
	
	private String meat;
	private double price;
	
	public HealthyHamberger(String meat, double price) {
		super("HealthyHamberger", "Brown herbal", meat, price);
		this.meat = meat;
		this.price = price;
		
	}
	private String additionalTopping1;
	private double additionalToppingPrice1;

	
	private String additionalTopping2;
	private double additionalToppingPrice2;
	
	public void addTopping1(String name, double price) {
		this.additionalTopping1 = name;
		this.additionalToppingPrice1 = price;
	}
	public void addTopping2(String name, double price) {
		this.additionalTopping2 = name;
		this.additionalToppingPrice2 = price;
	}
	@Override
	public double finishOrder(){
		double HealthHamBergerPrice = super.finishOrder();
		if(additionalTopping1 != null){
			HealthHamBergerPrice += additionalToppingPrice1;
			System.out.println(this.additionalTopping1 + " topping has been added for $" +this.additionalToppingPrice1);
		}
		if(additionalTopping2 != null){
			HealthHamBergerPrice += additionalToppingPrice2;
			System.out.println(this.additionalTopping2 + " topping has been added for $" +this.additionalToppingPrice2);
		}

		return HealthHamBergerPrice;
	}
}
