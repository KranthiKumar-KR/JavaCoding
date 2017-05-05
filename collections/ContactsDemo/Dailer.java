package collections.ContactsDemo;

import java.util.*;
import java.util.Map.Entry;

public class Dailer {
private static Map<Integer, Contact> contactList = new HashMap<Integer, Contact>();
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

contactList.put(1, new Contact(1, "kranthi"));
contactList.get(1).addNumbers("Mobile", "9799000155");
contactList.get(1).addNumbers("Home", "9794293456");
contactList.get(1).addNumbers("Work", "9292651486");

contactList.put(2, new Contact(1, "Rajesh"));
contactList.get(2).addNumbers("Mobile", "2342342341");
contactList.get(2).addNumbers("Home", "3453453451");
contactList.get(2).addNumbers("Work", "4564564561");

contactList.put(3, new Contact(1, "Narendra"));
contactList.get(3).addNumbers("Mobile", "4324324329");
contactList.get(3).addNumbers("Home", "5435435439");
contactList.get(3).addNumbers("Work", "6546546549");

contactList.put(4, new Contact(1, "Buddi"));
contactList.get(4).addNumbers("Mobile", "3543543540");
contactList.get(4).addNumbers("Home", "1321321320");
contactList.get(4).addNumbers("Work", "2432432430");

contactList.put(5, new Contact(1, "Sai"));
contactList.get(5).addNumbers("Mobile", "2233223322");
contactList.get(5).addNumbers("Home", "3344334433");
contactList.get(5).addNumbers("Work", "4455445544");

int myNo = 1;
while(true){
	if(myNo ==0) {
		break;
	}
	System.out.println("available contacts are:");
getContactList();
	System.out.println("Please select the contact");
	myNo = sc.nextInt();
	if(contactList.containsKey(myNo)) {
		Map<String, String> numbers = contactList.get(myNo).getNumbers();
		for(Entry<String, String> nums : numbers.entrySet()) {
			System.out.println(nums);
		}
	} else {
		System.out.println("sorry contact not found");
	}
	
}
	}
	public static void getContactList() {
		for(Entry<Integer, Contact> contact: contactList.entrySet()) {
			System.out.println(contact.getKey()+ ". " +contact.getValue().getName());
		}
	}

}
