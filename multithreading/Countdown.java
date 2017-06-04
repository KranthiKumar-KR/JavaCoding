package multithreading;

public class Countdown {
	String color;
	int i =0;

	public void doCountdown() {
		switch (Thread.currentThread().getName()) {
		case "Thread 1":
			color = ThreadColor.ANSI_BLUE;
			break;
		case "Thread 2":
			color = ThreadColor.ANSI_GREEN;
			break;
		default:
			color = ThreadColor.ANSI_CYAN;
		}

		for (i = 0; i < 10; i++) {
			System.out.println(color + Thread.currentThread().getName() + " i:" + i);
		}
	}

}
