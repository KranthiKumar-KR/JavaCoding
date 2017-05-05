
public class Furniture {
	private int noOfBeds;
	private int noOfChairs;
	private int noOfPillows;
	private boolean bedsheet;
	
	public Furniture(int noOfBeds, int noOfChairs, int noOfPillows, boolean bedsheet) {
		super();
		this.noOfBeds = noOfBeds;
		this.noOfChairs = noOfChairs;
		this.noOfPillows = noOfPillows;
		this.bedsheet = bedsheet;
	}

	public void isBedReady(int pillows, boolean sheet){
		this.bedsheet =sheet;
		this.noOfPillows = pillows;
		if(bedsheet){
			if(noOfPillows >=2){
			System.out.println("Bed is ready to sleep");
			}
		} else{
			System.out.println("bed is not ready");
		}
	}

}
