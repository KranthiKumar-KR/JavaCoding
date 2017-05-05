
public class Passed {
	double marks;
	String subName;
	
	public Passed(double marks, String subName) {
		this.marks = marks;
		this.subName = subName;
	}

	public boolean isPassed(double marks){
		this.marks = marks;
		if(marks>=26){
			System.out.println("passed in " +subName);
			return true;

		}
		System.out.println("failed in " +subName);
		return false;
		
	}

}
