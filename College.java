
public class College {
	private String DepartId;
	private String DepartName;
	private int noOfStuds;
	private int noOfStaff;
private String blockName;

public College(String DeptId, String DeptName, int noOfStds, int noOfStaff, String blkName){
	this.DepartId = DeptId;
	this.DepartName = DeptName;
	this.noOfStuds = noOfStds;
	this.noOfStaff = noOfStaff;
	this.blockName = blkName;
	System.out.println("college constructor called");
	
}

public String getDepartId() {
	return DepartId;
}

public String getDepartName() {
	return DepartName;
}

public int getNoOfStuds() {
	return noOfStuds;
}

public int getNoOfStaff() {
	return noOfStaff;
}

public String getBlockName() {
	return blockName;
}
public void studFacRatio(int studCount, int facCount){
	noOfStuds = studCount;
	noOfStaff = facCount;
	double ratio = noOfStuds/noOfStaff;
	System.out.println("studFacRatio method is being called, the value is: " +ratio);
//	return ratio;
}
}
