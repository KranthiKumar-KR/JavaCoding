package autoBoxingUnboxing;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transaction;
	public Customer(String name, Double initialAmount) {
		this.name = name;
		this.transaction =  new ArrayList<Double>();
		addTransaction(initialAmount);
	}
	
	public void addTransaction(Double amount) {
		this.transaction.add(amount);
	}
	
	public ArrayList<Double> getTransactions(){
		return transaction;
	}
	public String getCustomerName(){
		return this.name;
	}

}
