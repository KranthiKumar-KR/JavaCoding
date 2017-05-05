package singleTonClasses;

public class Singletondemo {
	String name;
	int pass;
	private static Singletondemo s1 = new Singletondemo();

	private Singletondemo() {

	}

	public static Singletondemo getSingletondemo() {
		return s1;
	}
}
