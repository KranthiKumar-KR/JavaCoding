package multithreading;

public class ThreadSynchronizingEx1CountdownMethodSynch {

	public synchronized void doCountdown() {
		int i;
		switch (Thread.currentThread().getName()) {
		case "Thread-0":
			Thread.currentThread().setName("kranthi");
			// System.out.println(Thread.currentThread().getName());
			break;
		case "Thread-1":
			Thread.currentThread().setName("kumar");
			break;
		default:
			Thread.currentThread().setName("polimetla");
			break;

		}
		
		for (i =0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() +" i:" +i);
		}
	}

}
