package autoBoxingUnboxing;

import java.util.ArrayList;
import java.util.Scanner;

import arraylist.Contacts;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Bank bofa = new Bank("Bank of America");

	public static void main(String[] args) {
		boolean quit = false;
		printActions();
		while (!quit) {
			System.out.println("\n please enter your choice \n");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 0:
				addBranch();
				break;
			case 1:
				printBranchList();
				break;
			case 2:
				addCustomer();
				break;
			case 3:
				printCustomerList();
				break;
			case 4:
				addTransaction();
				break;
			case 5:
				printTransactionList();
				break;
			case 6:
				printActions();
				break;

			}

		}
	}

	private static void printTransactionList() {
		System.out.println("please enter the branch name where you want look for customers \n");
		String branchName = scanner.nextLine();
		Branch searchBranch = bofa.findBranch(branchName);
		if (searchBranch != null) {
			System.out.println("Please enter the customer name \n");
			String customerName = scanner.nextLine();
			Customer searchCustomer = searchBranch.findCustomer(customerName);
			if (searchCustomer != null) {
				bofa.printCustomerList(branchName, true);
			}
		} else {
			System.out.println("sorry no files are found for the entered details");
		}
	}

	private static void addTransaction() {
		System.out.println("enter the branch name where you want to add transaction \n");
		String branchName = scanner.nextLine();
		Branch searchBranch = bofa.findBranch(branchName);
		if (searchBranch != null) {
			System.out.println("enter the customer name to whom you want to add transaction \n");
			String customerName = scanner.nextLine();
			if (searchBranch.findCustomer(customerName) != null) {
				System.out.println("enter the transaction amount \n");
				Double transactionAmount = scanner.nextDouble();
				searchBranch.addCustomerTransaction(customerName, transactionAmount);
				System.out.println("a new transaction of amount $" +transactionAmount
						+ " has been added to the customer " + customerName);
			}else {
				System.out.println("transaction is failed, please check the enter details and try again");
			}

		} else {
			System.out.println("transaction is failed, please check the enter details and try again");
		}

	}

	private static void printCustomerList() {
		System.out.println("Please enter the branch name where you want to print customers list \n");
		String branchName = scanner.nextLine();
		Branch searchBranch = bofa.findBranch(branchName);
		if (searchBranch != null) {
			bofa.printCustomerList(branchName, false);
			}
		}


	private static void addCustomer() {
		System.out.println("Please enter the branch name where you want to addCustomer \n");
		String branchName = scanner.nextLine();
		Branch searchBranch = bofa.findBranch(branchName);
		if (searchBranch != null) {
			System.out.println("Please enter the name of new customer \n");
			String newCustomer = scanner.nextLine();
			
			System.out.println("please enter the initial deposit amount to be added");
			Double initialAmount = scanner.nextDouble();
			if(initialAmount >= 25) {
				if(searchBranch.addCustomer(newCustomer, initialAmount)) {
					System.out.println("a new customer: " +newCustomer + "has been added successfully with initial deposit $" +initialAmount);
				} else
					System.out.println("customer " +newCustomer + " already exist in the list");
			} else 
				System.out.println("initial deposit value is less than minimum required deposit");
			
		} else 
			System.out.println("process failed please check the entered branch name");
	}

	private static void printBranchList() {
		if (bofa != null) {
			bofa.printBranchList();
		}
	}

	private static void printActions() {
		System.out.println("\n please enter your choice: \n available options are");
		System.out.println("0 -> to add a new branch \n" + "1 -> to print all the available branches \n"
				+ "2 -> to add new customer \n" + "3 -> to print all the available customers in a branch \n"
				+ "4 -> to add a new transaction for a customer \n" + "5 -> to print all available transactions \n"
				+ "6 -> to print available actions");
	}

	private static void addBranch() {
		System.out.println("Please enter the branch name \n");
		String branchName = scanner.nextLine();
		if(bofa.addBranch(branchName)) {
			System.out.println("a new branch: " +branchName + " has been added successfully");
			bofa.addBranch(branchName);
		} else 
			System.out.println("branch already exists");
		

	}

}
