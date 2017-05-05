package collections.SetsandHashsets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	
	private static Set<Integer> squares = new HashSet<> ();
	private static Set<Integer> cubes = new HashSet<> ();

	public static void main(String[] args) {
for(int i =1;i <= 100; i++) {
	squares.add(i*i);
	cubes.add(i*i*i);
}
System.out.println("no of square numbers in the squares set: " +squares.size());
System.out.println("no of cubes in the cubes set: " +cubes.size());

Set<Integer> union = new HashSet<>(cubes);
union.addAll(squares);
System.out.println("no of elements in the cube are : " +union.size());

Set<Integer> intersection = new HashSet<>(squares);
intersection.retainAll(cubes);
System.out.println("no of elements in the intersection of squares and cubes are: " +intersection.size());

for(int i : intersection) {
	System.out.println(i+ " is the square of " +Math.sqrt(i) + " and " +i +" is the cube of " + Math.cbrt(i) );
}

String sentence = "Hi my name is kranthi";
String[] nativeWords = sentence.split(" ");
Set<String> nativeSet = new HashSet<>(Arrays.asList(nativeWords));
System.out.println("words in native set are:");
printSet(nativeSet);

String friendIntro = "Hi he is my friend and his name is rajesh";
String[] friendWords = friendIntro.split(" ");
Set<String> friendSet = new HashSet<>(Arrays.asList(friendWords));
System.out.println("words in friend set are:");
printSet(friendSet);


/**
 * intersection of words
 */
Set<String> wordsIntersection = new HashSet<> (Arrays.asList(nativeWords));
wordsIntersection.retainAll(Arrays.asList(friendWords));
for(String intersections : wordsIntersection) {
	System.out.println(intersections);
}

/**
 * union of words
 */
System.out.println("union of two words arrays is: ");
Set<String> wordsUnion = new HashSet<>(Arrays.asList(nativeWords));
wordsUnion.addAll(Arrays.asList(friendWords));
printSet(wordsUnion);

/**
 * asymmetric difference of the two words arrays
 */
System.out.println("the symmetric difference betweeen two word arrays is: ");
Set<String> symmDiff = new HashSet<> (Arrays.asList(nativeWords));
symmDiff.removeAll(Arrays.asList(friendWords));
printSet(symmDiff);


/**
 * asymmetric difference between the two word arrays
 */
System.out.println("asyymetric difference between native words set and friend words set");
Set<String> diff1 = new HashSet<>(Arrays.asList(nativeWords));
diff1.removeAll(Arrays.asList(friendWords));
printSet(diff1);

System.out.println("Asymmetric difference between friend words set and native words set");
Set<String> diff2 = new HashSet<>(Arrays.asList(friendWords));
diff2.removeAll(Arrays.asList(nativeWords));
printSet(diff2);


	}
	
	/**
	 * to print out all the elements present inside a set collection
	 * @param set
	 */
	public static void printSet(Set<String> set) {
		System.out.print("\t");
		for(String word: set) {
			System.out.print(word + " ");
		}
		System.out.println();
	}

}
