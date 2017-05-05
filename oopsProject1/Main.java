package oopsProject1;

public class Main {

	public static void main(String[] args) {

		Burger b = new Burger("DoubleHam", "herbal", "Pork", 3.50);
		System.out.println(b.finishOrder());
		b.addingTopping1("Extra cheese", 1.20);
		b.addingTopping2("Lettuce", 0.50);
		b.addingTopping3("Pickles", 0.75);
		b.addingTopping4("Tomato", 0.80);
		
		System.out.println("final price is $" +b.finishOrder());
		
		System.out.println("**********************************************************");
		
		HealthyHamberger hb = new HealthyHamberger("sausage", 5.86);
		System.out.println(hb.finishOrder());
		hb.addTopping1("egg", 2.50);
		hb.addTopping2("Jalapeno", 1.50);
		System.out.println("Total price is $" +hb.finishOrder());
		
		System.out.println("**********************************************************");
		
		DeluxeBerger db = new DeluxeBerger();
		System.out.println("final price is $" +db.finishOrder());
		
	}

}
