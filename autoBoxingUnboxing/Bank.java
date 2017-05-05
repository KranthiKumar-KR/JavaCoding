package autoBoxingUnboxing;

import java.util.ArrayList;

import arraylist.Contacts;

public class Bank {
	private String bankName;
	private ArrayList<Branch> branchList;

	public Bank(String bankName) {
		this.bankName = bankName;
		this.branchList = new ArrayList<Branch>();
	}

	public String getBankName() {
		return this.bankName;
	}
	public ArrayList<Branch> getBranchesList(){
		return branchList;
	}

	// ****************** Branches *****************************//
	public boolean addBranch(String newBranch) {
		if(findBranch(newBranch) == null) {
            this.branchList.add(new Branch(newBranch));
            return true;
        }

        return false;

	}

	public void printBranchList() {
		System.out.println("Following are the available branches: \n");
		for (int i = 0; i < this.branchList.size(); i++) {
			System.out.println(i + 1 + ". " + this.branchList.get(i).getBranchName());
		}
	}

	public Branch findBranch(String branch) {
		for (int i = 0; i < branchList.size(); i++) {
			Branch checkedBranch = branchList.get(i);
			if (checkedBranch.getBranchName().equals(branch)) {
				return checkedBranch;
			}
		}
		return null;
	}

	// ********************* Customers ****************************************

	public boolean addCustomer(String branchName, String newCustomer, Double amount) {
		Branch checkedBranch = findBranch(branchName);
		if (checkedBranch != null) {
			checkedBranch.addCustomer(newCustomer, amount);
			return true;
		} else
			return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, Double amount) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			return branch.addCustomerTransaction(customerName, amount);
			
		}
		return false;
	}

	public boolean printCustomerList(String branchName, boolean printTransactions) {
		Branch checkedBranch = findBranch(branchName);
		if (checkedBranch != null) {
			ArrayList<Customer> customerList = checkedBranch.getCustomerList();
			System.out.println("The available customers in the branch " +branchName + " are: \n");
			for (int i= 0; i < customerList.size(); i++){
				Customer branchCustomer = customerList.get(i);
				System.out.println(i+1 + ". " + branchCustomer.getCustomerName());
				if(printTransactions) {
					ArrayList<Double>	transactionList = branchCustomer.getTransactions();
					System.out.println("The available transactions for the customer " +branchCustomer.getCustomerName() + " are: \n");
					for(int j = 0; j < transactionList.size(); j++) {
						System.out.println(j+1 + ". " + transactionList.get(j));
					}
					
				}
				
			}
			return true;
		}
		return false;
	}


	

}
