package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable {
	private String Firstname;
	private String lastName;
	private int dob;
	private int age;
	public String getFirstname() {
		return Firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDob() {
		return dob;
	}

	public int getAge() {
		return age;
	}

	public int getSsn() {
		return ssn;
	}

	private int ssn;

	public ExternalizationDemo() {
		System.out.println("zero arg constructor is called");
	}

	public ExternalizationDemo(String firstname, String lastName, int age) {
		System.out.println("constructor is called");

		Firstname = firstname;
		this.lastName = lastName;
		this.age = age;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(Firstname);
		out.writeObject(lastName);
		out.writeInt(age);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		Firstname = (String) in.readObject();
		lastName = (String) in.readObject();
		age = in.readInt();
	}

	
}
