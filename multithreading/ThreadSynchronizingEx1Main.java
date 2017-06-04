package multithreading;

public class ThreadSynchronizingEx1Main {

	public static void main(String[] args) {
ThreadSynchronizingEx1CountdownMethodSynch methodSynch = new ThreadSynchronizingEx1CountdownMethodSynch();
ThreadSynchronizationEx1CountdownThread countdownThread = new ThreadSynchronizationEx1CountdownThread(methodSynch);

ThreadSynchronizationEx1CountdownThread countdownThread2 = new ThreadSynchronizationEx1CountdownThread(methodSynch);

countdownThread.start();
countdownThread2.start();

ThreadSynchronizationEx1CountdownBlockSynch blockSynch = new ThreadSynchronizationEx1CountdownBlockSynch();
ThreadSynchronizationEx1CountdownThread2 countdownThread3 = new ThreadSynchronizationEx1CountdownThread2(blockSynch);

ThreadSynchronizationEx1CountdownThread2 countdownThread4 = new ThreadSynchronizationEx1CountdownThread2(blockSynch);

countdownThread3.start();
countdownThread4.start();
	}

}
