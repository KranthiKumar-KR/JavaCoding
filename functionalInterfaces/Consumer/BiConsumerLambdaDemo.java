package functionalInterfaces.Consumer;

import java.util.function.BiConsumer;

public class BiConsumerLambdaDemo {
	static String fullName;

	public static void main(String[] args) {

		concatNames.accept("kranthi", " kumar");
		System.out.println(fullName);
		
		replaceName.accept("shanker", " Polimetla");
		System.out.println(fullName);

	}

	static BiConsumer<String, String> concatNames = (s1, s2) -> {
		fullName = s1 + s2;
	};
	
	static BiConsumer<String, String> replaceName = (s1, s2) -> {
		fullName = "";
		fullName = s1+s2;
	};
}
