
public class Student{
	String studName;
	String StudNo;
	int marks;
	String subName;
	/*public Student(String DeptId, String DeptName, int noOfStds, int noOfStaff, String blkName, int attendance,
			String subject, double marks, String name, String no) {
		super(DeptId, DeptName, noOfStds, noOfStaff, blkName, attendance, subject, marks);
		this.studName = name;
		this.StudNo = no;
	}*/
	private Department department;
	public Student(String studName, String studno, int marks, String subname, Department department) {
		super();
		this.studName = studName;
		this.StudNo = studno;
		this.department = department;
		this.marks = marks;
		this.subName = subname;
	}
	public String getStudName() {
		return studName;
	}
	public String getStudNo() {
		return StudNo;
	} 
	public int getMarks() {
		return marks;
	}
	public String getSubName() {
		return subName;
	}
	public Department getDepartment() {
		return department;
	}
	public void isPassed(){
		if(marks>=26){
			System.out.println("passed in " +subName);

		} else
		System.out.println("failed in " +subName);
		
	} 
	
}
