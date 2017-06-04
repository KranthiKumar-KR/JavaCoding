package multithreading;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		System.out.println("this is hi from a demo thread created using extending thread class " +Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000); 
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " has been interrupted " +e.getMessage());
				return;
			}
	}
	
	
	

}
