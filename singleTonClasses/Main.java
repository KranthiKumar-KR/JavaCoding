package singleTonClasses;

public class Main {

	public static void main(String[] args) {
Singletondemo s2 = Singletondemo.getSingletondemo();
Singletondemo s3 = Singletondemo.getSingletondemo();
Singletondemo s4 = Singletondemo.getSingletondemo();
s2.name = "kranthi";
s2.pass = 222;
s3.name = "kumar";
s3.pass = 56;
s4.name = "krantz";
s4.pass = 87;
System.out.println(s2.name + s2.pass);
System.out.println(s3.name + s3.pass);
System.out.println(s4.name + s4.pass);
	}

}
