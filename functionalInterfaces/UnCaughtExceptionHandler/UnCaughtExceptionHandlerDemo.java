package functionalInterfaces.UnCaughtExceptionHandler;

public class UnCaughtExceptionHandlerDemo {

	public static void main(String[] args) {
		Thread t = new Thread(new Demo2());
		t.setUncaughtExceptionHandler((Thread t1, Throwable e) -> System.out
				.println(Thread.currentThread().getName() + " throws exception " + e));
		t.start();

		Thread t2 = new Thread(() -> {
			System.out.println("should throw exception");
			throw new ClassCastException();
		});
		t2.setUncaughtExceptionHandler((thread, exception) -> {
			System.out.println(Thread.currentThread().getName() + " throws an exception " + exception);
		});
		t2.start();
	}

}

class Demo2 implements Runnable {

	@Override
	public void run() {
		throw new RuntimeException();
	}

}