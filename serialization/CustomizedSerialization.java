package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerialization {

	public static void main(String[] args) throws Exception {
	
		A a1 = new A(2);
		System.out.println(a1.name + "...." +a1.password );
		FileOutputStream fos = new FileOutputStream("file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		A a2 = (A) ois.readObject();
		
		System.out.println(a2.name + "..." +a2.password);
	}

}
