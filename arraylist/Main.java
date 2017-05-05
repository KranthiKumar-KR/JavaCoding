package arraylist;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Contacts contact;
	private static MobilePhone mobile = new MobilePhone("979000155");
	


	public static void main(String[] args) {

		boolean quit = false;
		

		startPhone();
		printActions();
		

		while (!quit) {
			System.out.println("\n please enter your choice \n");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 0:
				System.out.println("phone is switching off");
				quit = true;
				break;
			case 1:
				mobile.printContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;

			}

		}

	}

	private static void startPhone() {
		System.out.println("The phone is starting ");

	}

	private static void queryContact() {
		System.out.println("please enter the name of the contact \n");
		String name = scanner.nextLine();
		if (mobile.findContact(name) >= 0) {
			System.out.println("the entered contact is present on the file");
		} else
			System.out.println("cannot find the selected contact");

	}

	private static void removeContact() {
		System.out.println("please enter the name of the contact \n");
		String name = scanner.nextLine();
		if (mobile.findContact(name) >= 0) {
			mobile.deleteContact(mobile.queryContact(name));
		} else
			System.out.println("unable to find the entered contact");

	}

	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobile.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = new Contacts(newName, newNumber);
        if(mobile.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }

		/*System.out.println("please enter the name of the new contact you want to update \n");
		String oldname = scanner.nextLine();

		if (mobile.findContact(oldname) >= 0) {
			Scanner s2 = new Scanner(System.in);
			System.out.println("please enter the name of the new contact you want to update \n");
			String newname = s2.nextLine();
			System.out.println("please enter the mobile number you want to save");
			String number = s2.nextLine();
			Contacts newContact = Contacts.addContact(newname, number);
		
			mobile.updateContact(mobile.queryContact(oldname), newContact);
		} else
			System.out.println("unable to find the entered contact");
*/
	}

	private static void printActions() {
		System.out.println("\n please enter your choice: \n available options are");
		System.out.println("0 -> to switch off the mobile \n" + "1 -> to print all saved contacts \n"
				+ "2 -> to add new contact \n" + "3 -> to update an existing contact \n"
				+ "4 -> to remove an existing contact \n" + "5 -> to query a contact \n"
				+ "6 -> to print available actions");
	}

	private static void addContact() {
		System.out.println("please enter the name of the new contact:");
		Scanner scanner2 = new Scanner(System.in);
		String name = scanner2.nextLine();
		System.out.println("please enter the mobile number you want to save");
		String number = scanner2.nextLine();
		contact = new Contacts(name, number);
		if (mobile.addContact(contact)) {
			System.out.println(name + " has been added successfully with number " + number);
		} else
			System.out.println(" contact already exists in the file ");

	}

}
