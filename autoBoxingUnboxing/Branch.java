package autoBoxingUnboxing;

import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customer> customerList;
	
public Branch(String branchName){
	this.branchName = branchName;
	this.customerList = new ArrayList<Customer>();
}
public String getBranchName(){
	return this.branchName;
}

public boolean addCustomer(String newCustomer, Double initialAmount) {
	if(findCustomer(newCustomer) != null){
		System.out.println("customer already exits");
		return false;
	}
	System.out.println("new customer " +newCustomer + " has been added");
	this.customerList.add(new Customer(newCustomer, initialAmount));
	return true;
	
}
public Customer findCustomer(String customerName) {
	for(int i = 0; i<this.customerList.size();i++) {
		Customer existingCustomer = this.customerList.get(i);
		if(existingCustomer.getCustomerName().equals(customerName)) {
			return existingCustomer;
		}
	}
	return null;
}
/*public int findCustomer(String customerName) {
	for (int i = 0; i < this.customerList.size(); i++) {
		if (this.customerList.get(i).equals(customerName)) {
			return i;
		}
	}
	return -1;
}
*/

public boolean addCustomerTransaction(String  customerName, Double newTransaction){
	Customer existingCustomer = findCustomer(customerName);
	if(existingCustomer==null) {
		System.out.println("customer not find");
		return false;
	}
	existingCustomer.addTransaction(newTransaction);
	return true;
	
	
}

public void printCustomerList() {
	System.out.println("printing customers list in " +this.branchName + " branch");
	if(this.customerList.size() != 0){
	for(int i = 0; i<customerList.size(); i++) {
		System.out.println(i+1 + ". " +this.customerList.get(i).getCustomerName());
	}
	} else
		System.out.println("There are no customers in the selected branch");
}

public ArrayList<Customer> getCustomerList() {
	return customerList;
	
}
}
