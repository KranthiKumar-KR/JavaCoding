package polymorphism;

class Toyota extends Car{
	 String name;
	 int cylinderCount;
	public Toyota(String name, int cylinderCount) {
		super(name, cylinderCount);
		this.name = name;
		this.cylinderCount = cylinderCount;
				}
	@Override
	public boolean startEngine() {
		System.out.println(name + " engine has started");
		return super.startEngine();
	}
	@Override
	public boolean accelerate() {
		System.out.println(name + " engine has accelerated");
		return super.accelerate();
	}
	@Override
	public boolean brake() {
		System.out.println(name + " engine has deaccelerated");
		return super.brake();
	}
	
	}

//**********************************************

class Chevi extends Car{
	 String name;
	 int cylinderCount;
	public Chevi(String name, int cylinderCount) {
		super(name, cylinderCount);
		this.name = name;
		this.cylinderCount = cylinderCount;
				}
	@Override
	public boolean startEngine() {
		System.out.println(name + " engine has started");
		return super.startEngine();
	}
	@Override
	public boolean accelerate() {
		System.out.println(name + " engine has accelerated");
		return super.accelerate();
	}
	@Override
	public boolean brake() {
		System.out.println(name + " engine has deaccelerated");
		return super.brake();
	}
	}

//8***********************************************************

class Dodge extends Car{
	 String name;
	 int cylinderCount;
	public Dodge(String name, int cylinderCount) {
		super(name, cylinderCount);
		this.name = name;
		this.cylinderCount = cylinderCount;
				}
	@Override
	public boolean startEngine() {
		System.out.println(name + " engine has started");
		return super.startEngine();
	}
	@Override
	public boolean accelerate() {
		System.out.println(name + " engine has accelerated");
		return super.accelerate();
	}
	@Override
	public boolean brake() {
		System.out.println(name + " engine has deaccelerated");
		return super.brake();
	}
	
	}

//********************************************************

class Ford extends Car{
	 String name;
	 int cylinderCount;
	public Ford(String name, int cylinderCount) {
		super(name, cylinderCount);
		this.name = name;
		this.cylinderCount = cylinderCount;
				}
	@Override
	public boolean startEngine() {
		System.out.println(name + " engine has started");
		return super.startEngine();
	}
	@Override
	public boolean accelerate() {
		System.out.println(name + " engine has accelerated");
		return super.accelerate();
	}
	@Override
	public boolean brake() {
		System.out.println(name + " engine has deaccelerated");
		return super.brake();
	}
	
	}
//**************************************************************

public class CarsList {
	 

	public static void main(String[] args) {
		Toyota t1 = new Toyota("Camry", 4);
		t1.startEngine();
		t1.accelerate();
		t1.brake();
		System.out.println("**************************************************************");
		Ford f1 = new Ford("Mustang", 4);
		f1.setCylinders(6);
		f1.startEngine();
		f1.accelerate();
		f1.brake();
		System.out.println(f1.getCylinders());
		System.out.println("**************************************************************");
		
		Chevi c1 = new Chevi("Impala", 6);
		c1.startEngine();
		c1.accelerate();
		c1.brake();
		System.out.println("**************************************************************");
		Dodge d1 = new Dodge("Challenger", 6);
		d1.startEngine();
		d1.accelerate();
		d1.brake();


	}

}
