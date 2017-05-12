package functionalInterfaces.Function;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionLambdaDemo {
	private static String name;
	private static String name2= "";

	public static void main(String[] args) {
		addName.accept("kranthi");
		System.out.println(name);
	
		Arrays.asList(stringToInteger.apply("kumar")).forEach(System.out::println);
		
		for(char c: stringToInteger.apply(name)) {
			System.out.println(c);	
		}
		System.out.println(charToString.apply(stringToInteger.apply("shanker")));
	}

	static Consumer<String> addName = s -> name = s;

	static Function<String, char[]> stringToInteger = (s) -> {
		char[] c = s.toCharArray();
		return c;
	};
	
	static Function<char[], String> charToString = c-> {
		for(char c1 : c) {
			name2 = name2+c1;
		}
		return name2;
	};

}
