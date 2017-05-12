package functionalInterfaces.Consumer;

import java.util.function.Consumer;

public class ConsumerLambdaDemo {
	private static String firstName;

	public static void main(String[] args) {

		concatNames.accept("kranthi");
		System.out.println(firstName);

		concatNames.accept(" kumar");
		System.out.println(firstName);

		concatNames.accept(" Polimetla");
		System.out.println(firstName);
	}

	static Consumer<String> concatNames = (s1) -> {
		if (firstName != null) {
			firstName = firstName + s1;
		} else
			firstName = s1;
	};

}
