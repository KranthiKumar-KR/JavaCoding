package Externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		ExternalizationDemo d1 = new ExternalizationDemo("kranthi", "kumar", 22);
		FileOutputStream fos = new FileOutputStream("dataExternalization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("dataExternalization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo d2 = (ExternalizationDemo) ois.readObject();
		System.out.println(d2.getFirstname() + " " + d2.getLastName() + " " + d2.getAge());
	}
}
