package multithreading;

public class Main {
	public static void main(String[] args){
		
		//thread created using a class extending thread class
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		//we should always start or initiate thread using start(), we shouldn't start a thread using run().
		//start() will initiate the thread on a different thread specified by us
		//run() will initiate the thread on the parent thread which is calling run() instead of a different thread we are actually passing.
		
		
		//thread created using a class implementing runnable interface
		Thread t2= new Thread(new RunnableDemo());
		
		t2.start();
		
		//thread created using an anonymous inner class
		Thread t3 = new Thread( new Runnable() {
			@Override
			public void run() {
				try {
					t1.interrupt();
				t1.join();
				} catch (InterruptedException e) {
					System.out.println("this thread has been interrupted by " +Thread.currentThread().getName() +e.getMessage());
				}
				System.out.println("this is hi from thread created using anonymous inner class " +Thread.currentThread().getName());
			}
		});
		t3.start();
	}

}
