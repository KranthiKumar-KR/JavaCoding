package multithreading;

public class ThreadSynchronizationEx1CountdownBlockSynch {
	
	public  void doCountdown() {
		int i;
		switch (Thread.currentThread().getName()) {
		case "Thread-2":
			Thread.currentThread().setName("aaaa");
			// System.out.println(Thread.currentThread().getName());
			break;
		case "Thread-3":
			Thread.currentThread().setName("bbbb");
			break;
		default:
			Thread.currentThread().setName("cccc");
			break;

		}
		synchronized(this) {
		for (i =0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() +" i:" +i);
		}
		}
	}


}
