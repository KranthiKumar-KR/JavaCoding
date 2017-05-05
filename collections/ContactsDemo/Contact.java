package collections.ContactsDemo;

import java.util.*;

public class Contact {
private String name;
private int sl_no;
private Map<String, String> numbers;
public Contact(int sl_no, String name) {
	super();
	this.name = name;
	this.sl_no = sl_no;
	this.numbers = new HashMap<String, String>();
}
public void addNumbers(String type, String number) {
	numbers.put(type, number);
}
public String getName() {
	return name;
}
public int getSl_no() {
	return sl_no;
}

public Map<String, String> getNumbers() {
	return new HashMap<String, String>(numbers);
}


}
