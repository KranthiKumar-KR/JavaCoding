package singleTonClasses;

public class Singletondemo2 {

	String id;
	int dob;
	private static Singletondemo2 s2 = null;

	private Singletondemo2() {

	}

	public static Singletondemo2 getSingletondemo2() {
		if (s2 == null) {
			System.out.println("new instance being created");
			s2 = new Singletondemo2();
		}
		return s2;
	}
}
