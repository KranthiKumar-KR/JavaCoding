package functionalInterfaces.Comparator;

import java.util.*;
import java.util.function.Consumer;

public class ComparatorDemo {
static List<Student> students = new ArrayList<>();
	public static void main(String[] args) {
		Consumer<Student> addStudentsToList = (s) -> students.add(s);
		
		addStudentsToList.accept(new Student("aaa", 45, 3.4));
		addStudentsToList.accept(new Student("ddd", 32, 2.5));
		addStudentsToList.accept(new Student("ccc", 35, 3.9));
		addStudentsToList.accept(new Student("bbb", 18, 2.1));
		
		
		//sorting on id
		System.out.println("\n \t sorting on id");
		students.sort((s1, s2)->{
			return s1.getId().compareTo(s2.getId());
		});
		
		List<Student> sortedList = new ArrayList<>(students);
		sortedList.forEach(System.out::println);
		
		
		//sorting on gpa
		System.out.println("\n \t sorting on gpa ");
		students.sort((s1, s2)->{
			return s1.getGpa().compareTo(s2.getGpa());
		});
		students.forEach(System.out::println);
		
		//sorting on name
		System.out.println("\n \t sorting on name ");
		students.sort((s1, s2)->{
			return s1.getName().compareTo(s2.getName());
		});
		students.forEach(System.out::println);
	}
	

}
