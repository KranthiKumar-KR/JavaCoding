package arraylist;

import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contacts> myContacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contacts>();
	}

	public boolean addContact(Contacts contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("contact already exists");
			return false;
		}
		myContacts.add(contact);
		return true;
	}

	public boolean updateContact(Contacts oldContact, Contacts newContact) {
		int foundPosition = findContact(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;

	}

	public boolean deleteContact(Contacts contact) {
		if (findContact(contact) >= 0) {
			this.myContacts.remove(contact);
			System.out.println(contact.getName() + " has been successfully removed");
			return true;
		} else {
			System.out.println("contact not found");
			return false;
		}
	}

	public int findContact(Contacts contacts) {
		if (myContacts.contains(contacts)) {
			return this.myContacts.indexOf(contacts);
		} else {
			return -1;
		}
	}

	public int findContact(String name) {
		for (int i = 0; i < this.myContacts.size(); i++) {
			Contacts searchContact = this.myContacts.get(i);
			if (searchContact.getName().equals(name)) {
				return i;
			}

		}
		return -1;
	}

	public Contacts queryContact(String name) {
		for (int i = 0; i < this.myContacts.size(); i++) {
			Contacts searchContact = this.myContacts.get(i);
			if (searchContact.getName().equals(name)) {
				return myContacts.get(i);
			}
		}
		return null;
	}

	public void printContacts() {
		if(!myContacts.isEmpty()){
			System.out.println("your saved contact list:");
			for(int i = 0; i<this.myContacts.size(); i++) {
				System.out.println(i+1 + "." + myContacts.get(i).getName() +" -> : " +myContacts.get(i).getNumber());
			}		} else {
				System.out.println("contacts list is empty");
			}
	}
}
