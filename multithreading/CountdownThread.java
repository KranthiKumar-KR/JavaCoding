package multithreading;

public class CountdownThread extends Thread{
	Countdown threadCountdown;
	public CountdownThread(Countdown countdown) {
		this.threadCountdown = countdown;
	}
	
	@Override
	public void run() {
		threadCountdown.doCountdown();
	}

}
