package functionalInterfaces.predicates;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.*;

public class PredicateDemo {
	static Set<Employee> employees = new HashSet<>();

	public static void main(String[] args) {

		// consumer functional interface to add an employee to the employees
		// list
		Consumer<Employee> c = emp -> employees.add(emp);

		// employees list
		Employee shanker = new Employee(12, 25, "kranthi shanker", "Android", 85025.65, 2175501952L);
		Employee sai = new Employee(56, 27, "sai sajja", "jira", 86026.80, 3143568892L);
		Employee mala = new Employee(25, 25, "Mala Murali", "Java", 78024.00, 46464644444L);
		Employee bryan = new Employee(5, 29, "Bryan Korteg", "Design", 65027.65, 458198579L);
		Employee jack = new Employee(120, 45, "Jack Nork", "Management", 125045.12, 54565445687L);
		Employee josh = new Employee(34, 28, "Josh King", "Web", 77027.45, 89764985463L);

		// adding employee to the employees list
		c.accept(shanker);
		c.accept(sai);
		c.accept(mala);
		c.accept(bryan);
		c.accept(jack);
		c.accept(josh);

		System.out.println("employees list: ");
		employees.forEach(e -> System.out.println(e.getName()));
		System.out.println();

		// getting first names using method which uses the functional interfaces
		// internally
		System.out.println("employees first names: ");
		employees.forEach(e -> getFirstName(e, FunctionalInterfaces.getFirstName));
		System.out.println();

		// getting last names directly form the functional interfaces with out
		// any methods
		System.out.println("employees last names:");
		employees.forEach(e -> System.out.println(FunctionalInterfaces.getLastName.apply(e)));
		System.out.println();

		// to obtain list of employees whose age is greater than 27
		System.out.println("List employees whose age is greater than 27");
		employees.forEach(emp -> ageHigherThan27(emp, FunctionalInterfaces.elderThan27));
		System.out.println();

		// to obtain list of employees whose age is greater than 27
		System.out.println("List employees whose age is less than or equal to 27");
		employees.forEach(emp -> {
			if(FunctionalInterfaces.negation_youngerThan27.test(emp.getAge())) {
				System.out.println(emp.getName());
			}
		});
		System.out.println();

		// to obtain list of employees whose salary is greater than 80k
		System.out.println("employees with salary greater than 80k: ");
		employees.forEach(e -> highPaidEmps(e, FunctionalInterfaces.salaryGreaterThan80k));
		System.out.println();

		// to obtain list of employees whose salary is greater than 80k and
		// whose id is greater than or equal to 40
		System.out.println("List of employees whose salary is greater than 80k and id is greater than or equal to 40");
		employees.forEach(e -> highPaidNHighlevel(e, FunctionalInterfaces.highSalaryNHighLevel));
		System.out.println();

		// to obtain list of employees either whose salary is greater than 80k
		// or whose id is greater than or equal to 40
		System.out.println("List of employees whose salary is greater than 80k OR id is greater than or equal to 40");
		employees.forEach(e -> highPaidNHighlevel(e, FunctionalInterfaces.highSalaryORHighLevel));
		System.out.println();

	}

	public static void highPaidEmps(Employee e, Predicate<Employee> predicateCondition) {
		if (predicateCondition.test(e)) {
			System.out.println(e.getName() + ", " + e.getSalary());
		}
	}

	public static void ageHigherThan27(Employee e, IntPredicate ageCondition) {
		if (ageCondition.test(e.getAge())) {
			System.out.println(e.getName());
		}
	}

	public static void highPaidNHighlevel(Employee e, Predicate<Employee> condition) {
		if (condition.test(e)) {
			System.out.println(e.getName());
		}
	}

	public static void highPaidORHighlevel(Employee e, Predicate<Employee> condition) {
		if (condition.test(e)) {
			System.out.println(e.getName());
		}
	}

	public static void getFirstName(Employee e, Function<Employee, String> condition) {
		System.out.println(condition.apply(e));
	}
}
