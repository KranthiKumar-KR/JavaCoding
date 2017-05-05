package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A implements Serializable {
	String name = "kranthi";
	transient String password ="kr@nth!";
	public A(int i){
		System.out.println(i);
	}
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String ePass = "123"+password;
		oos.writeObject(ePass);
	}
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		String pswd = (String) ois.readObject();
	password = pswd.substring(3);
		
	}

}
