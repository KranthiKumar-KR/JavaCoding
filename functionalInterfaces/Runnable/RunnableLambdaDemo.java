package functionalInterfaces.Runnable;

public class RunnableLambdaDemo {

	public static void main(String[] args) {
		
		//thread and runnable using lambda expressions
		new Thread(() -> System.out
				.println("running on thread " + Thread.currentThread().getName() + " using lambda expressions"))
						.start();

		//thread and runnable using inner classes
		runOnThreadInnerClass();

		//thread and runnable using anonymous inner classes
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("running on thread " + Thread.currentThread().getName()
						+ " using anonymous inner class concept");
			}

		}).start();

	}

	public static void runOnThreadInnerClass() {
		Demo d = new Demo();
		new Thread(d).start();
	}

}

class Demo implements Runnable {

	@Override
	public void run() {
		System.out.println(
				"running on thread " + Thread.currentThread().getName() + " using normal inner classes concept");
	}

}