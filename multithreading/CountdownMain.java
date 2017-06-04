package multithreading;

public class CountdownMain {

	public static void main(String[] args) {
Countdown cd = new Countdown();
CountdownThread ct = new CountdownThread(cd);

CountdownThread ct2 = new CountdownThread(cd);

/**
 * by passing two different values we provide two different objects to the threads
 * so there wont be any racing condition between the threads
 * two threads will do their own operations on the different objects 
 * but this is not a good or accepted way of dealing with thread interruption
 * there is a proper way of dealing with thread interruption
 * that is called thread synchronization
 */
//Countdown cd2 = new Countdown();
//CountdownThread ct2 = new CountdownThread(cd2);


ct.start();
ct2.start();
	}

}
