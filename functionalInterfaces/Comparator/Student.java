package functionalInterfaces.Comparator;

public class Student {
private String name;
private int id;
private double gpa;

public Student(String name, int id, double gpa) {
	super();
	this.name = name;
	this.id = id;
	this.gpa = gpa;
}

public String getName() {
	return name;
}
public Integer getId() {
	return id;
}
public Double getGpa() {
	return gpa;
}

@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
}




}
