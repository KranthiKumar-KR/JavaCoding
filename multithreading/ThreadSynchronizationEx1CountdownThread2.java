package multithreading;

public class ThreadSynchronizationEx1CountdownThread2 extends Thread{
	
	ThreadSynchronizationEx1CountdownBlockSynch blockSynch;

	public ThreadSynchronizationEx1CountdownThread2(ThreadSynchronizationEx1CountdownBlockSynch blockSynch) {
		this.blockSynch = blockSynch;
	}

	@Override
	public void run() {
		blockSynch.doCountdown();
	}
	
	

}

