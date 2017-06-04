package multithreading;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
System.out.println("this is hi from RunnableDemo created using implementing a runnable class " +Thread.currentThread().getName());		
	}
	

}
