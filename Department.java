
public class Department extends College{
	private int attendance;
	private double condonation;
	public Department(String DeptId, String DeptName, int noOfStds, int noOfStaff, String blkName, int attendance) {
		super(DeptId, DeptName, noOfStds, noOfStaff, blkName);
		this.attendance = attendance;
	}
	
	public int getAttendance() {
		return attendance;
	}

	public double getCondonation() {
		return condonation;
	}

	public double calCond(int attendance){
		this.attendance = attendance;
		if(attendance>=60){
			condonation = 0;
			System.out.println("your condonation is: " +condonation);
		} else if(attendance<60 && attendance>=50) {
			condonation = 350;
			System.out.println("your condonation is: " +condonation);
		} else if(attendance<50 && attendance>=40) {
			condonation = 1500;
			System.out.println("your condonation is: " +condonation);
		} else if(attendance<40 && attendance>=35) {
			condonation = 5000;
			System.out.println("your condonation is: " +condonation);
		} else {
			System.out.println("sorry!! you are detained");
		}
		return condonation;
	}

}
