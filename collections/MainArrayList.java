package collections;

public class MainArrayList {
	static ArrayListTheatre theatre;
	public static void main(String[] args) {
		theatre = new ArrayListTheatre("berlin AMC", 8, 12);
		//theatre.getSeatNumbers();
		bookSeat("A01");
		bookSeat("A02");
		bookSeat("A03");
		bookSeat("A04");
		bookSeat("A05");
		bookSeat("A06");
		bookSeat("A07");
		bookSeat("A08");

		theatre.availableSeats();
		bookSeat("A09");
		theatre.availableSeats();


		
	}
	public static void bookSeat(String seatNo) {
		if (theatre.reserveSeat(seatNo)) {
			System.out.println("seat " +seatNo + " is reserved");

			System.out.println("please pay the final amount");
		} else
			System.out.println("sorry seat is not available or already taken, Please check the available seats");
	}

}
