package multithreading;

public class CountdownMain {

	public static void main(String[] args) {
Countdown cd = new Countdown();
Countdown cd2 = new Countdown();
CountdownThread ct = new CountdownThread(cd);
ct.start();

CountdownThread ct2 = new CountdownThread(cd2);
ct2.start();
	}

}
