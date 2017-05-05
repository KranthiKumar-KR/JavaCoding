package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTheatre {
	private String theatreName;
	private List<Seat> seats = new ArrayList<Seat>();

	public ArrayListTheatre(String theatreName, int noOfRows, int seatsPerRow) {
		this.theatreName = theatreName;

		int lastRow = 'A' + (noOfRows - 1);
		System.out.println("last row is " + lastRow);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}

	public String getTheatreName() {
		return theatreName;
	}

	public boolean reserveSeat(String seatNo) {
		Seat requestedSeat = new Seat(seatNo);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if (foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else
			System.out.println("requested seat " + seatNo + " is not available");
		return false;
	}

	public void availableSeats() {
		System.out.println("available seats are: ");
		for (Seat seat : seats) {
		if(seat.checkAvailability()) {
			System.out.print(seat.getSeatNumber() + " | ");
		}
		}
		System.out.println();

	}

	public void getSeatNumbers() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}

}
