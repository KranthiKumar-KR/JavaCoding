package singleTonClasses;

public class Main2 {
	public static void main(String[] args) {
		Singletondemo2 s2 = Singletondemo2.getSingletondemo2();
		s2.id = "kranthi";
		s2.dob = 222;
		System.out.println(s2.id + s2.dob);
		Singletondemo2 s = Singletondemo2.getSingletondemo2();
		s.id = "jjjjjj";
		s.dob = 777;
		System.out.println(s2.id + s2.dob);
	}
}
