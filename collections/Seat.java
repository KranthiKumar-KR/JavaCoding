package collections;

public class Seat implements Comparable<Seat> {
	private String seatNumber;
	private boolean isReserved;
	
	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	
	public boolean checkAvailability(){
		if(!isReserved) {
			return true;
		} else 
			return false;
	}
	public boolean reserve() {
		if(!isReserved) {
			isReserved = true;
			return true;
		} else 
			return false;
	}
	
	public boolean cancel() {
		if(isReserved) {
			isReserved = false;
			System.out.println("Reservation of seat " +seatNumber +" is cancelled");
			return true;
		} else 
			return false;
	}
	
	public String getSeatNumber(){
		return seatNumber;
	}

	@Override
	public int compareTo(Seat o) {
		return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
	}

}
