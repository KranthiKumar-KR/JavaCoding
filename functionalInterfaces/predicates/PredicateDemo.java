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
		Employee sai = new Employee(56, 27, "sai sajja", "jira", 76026.80, 3143568892L);
		Employee mala = new Employee(25, 25,  "Mala Murali", "Java", 78024.00, 46464644444L);
		Employee bryan = new Employee(5, 29, "Bryan Korteg", "Design", 65027.65, 458198579L);
		Employee jack = new Employee(120, 45, "Jack Nork", "Management", 125045.12, 54565445687L);
		Employee josh = new Employee(34, 28, "Josh King", "Web", 82027.45, 89764985463L);

		// adding employee to the employees list
		c.accept(shanker);
		c.accept(sai);
		c.accept(mala);
		c.accept(bryan);
		c.accept(jack);
		c.accept(josh);

		System.out.println("employees list: \n");
		employees.forEach(e -> System.out.println(e.getName()));
		System.out.println();

		Predicate<Employee> salaryGreaterThan80k = emp -> emp.getSalary() >= 80000.00;
		
		System.out.println("employees with salary greater than 80k: \n");
		employees.forEach( e -> highPaidEmps(e, salaryGreaterThan80k));

	}

	public static void highPaidEmps(Employee e, Predicate<Employee> predicateCondition) {
		if (predicateCondition.test(e)) {
			System.out.println(e.getName() + ", " + e.getSalary());
		}
	}

}
