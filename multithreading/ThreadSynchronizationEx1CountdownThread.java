package multithreading;

public class ThreadSynchronizationEx1CountdownThread extends Thread{
	
	ThreadSynchronizingEx1CountdownMethodSynch methodSynch;

	public ThreadSynchronizationEx1CountdownThread(ThreadSynchronizingEx1CountdownMethodSynch methodSynch) {
		this.methodSynch = methodSynch;
	}

	@Override
	public void run() {
		methodSynch.doCountdown();
	}
	
	

}
