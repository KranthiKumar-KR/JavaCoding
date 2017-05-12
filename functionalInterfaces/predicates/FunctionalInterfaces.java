package functionalInterfaces.predicates;

import java.util.function.*;

public class FunctionalInterfaces {

	public static Predicate<Employee> salaryGreaterThan80k = emp -> emp.getSalary() >= 80000.00;
	public static IntPredicate elderThan27 = (age) -> age > 27;
	public static IntPredicate negation_youngerThan27 = elderThan27.negate();
	public static Predicate<Employee> idGreaterThan40 = e -> e.getId() >= 40;
	public static Predicate<Employee> highSalaryNHighLevel = salaryGreaterThan80k.and(idGreaterThan40);
	public static Predicate<Employee> highSalaryORHighLevel = salaryGreaterThan80k.or(idGreaterThan40);
	
	public static Function<Employee, String> getLastName = e -> {
		return e.getName().substring(e.getName().indexOf(' ')+1);
	};
	
	public static Function<Employee, String> getFirstName = e -> {
		return e.getName().substring(0, e.getName().indexOf(' '));
	};

}
