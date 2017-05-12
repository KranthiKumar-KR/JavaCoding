package functionalInterfaces.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionalLambdaDemo {
private static List<String> list1 = new ArrayList<>();
private static List<String> list2 = new ArrayList<>();

	public static void main(String[] args) {
list1.add("Hi");
list1.add("I am ");
list1.add("kranthi");


list2.add("what is");
list2.add("your name");
list2.add("how are u");
list2.add("doing");

System.out.println(addTwoLists.apply(list1,  list2));
	}

	static BiFunction<List<String>, List<String>, List<String>> addTwoLists = (al1, al2) -> {
		ArrayList<String> al3 = (ArrayList<String>) al1;
		al3.addAll(al2);
		return al3;
	};
}
