
public class Floor extends Furniture{
	private boolean vacuumCleaned;
	private boolean furnitureClean;

	public Floor(int noOfBeds, int noOfChairs, int noOfPillows, boolean bedsheet) {
		super(noOfBeds, noOfChairs, noOfPillows, bedsheet);
		// TODO Auto-generated constructor stub
	}
	private void isVacuumed(boolean vacuum){
		this.vacuumCleaned = vacuum;
		if(vacuumCleaned){
			System.out.println("floor is cleaned with vaccuum");
		} else{
			System.out.println("furniture is not cleaned");
		}
	}
	private void isFurnitureCleaned(boolean furniture){
		this.furnitureClean = furniture;
		if(furnitureClean){
			System.out.println("furniture is cleaned");
		} else{
			System.out.println("furniture is not cleaned");
		}
	}
	public void isFloorSet(boolean vac, boolean furn){
		isVacuumed(vac);
		isFurnitureCleaned(furn);
	}
}
