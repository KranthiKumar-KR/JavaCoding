package functionalInterfaces.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionLambdaDemo {
	private static String name;
	private static String name2= "";
	private static String fullname;

	public static void main(String[] args) {
		System.out.println(addName.apply(name, "kranthi"));
		System.out.println(addName.apply(fullname, "kranthi kumar"));
		name2 = toUpperCase.andThen(getFirstName).apply(addName.apply(fullname, "kranthi kumar"));
		System.out.println(name2);
		
		
	}

	static BiFunction<String, String, String> addName = (String name, String passingName) -> {
		return name = passingName;
	};
	
	static Function<String, String> toUpperCase = s1 -> s1.toUpperCase();
	static Function<String, String> getFirstName = s2 -> s2.substring(0, s2.indexOf(' '));


}
