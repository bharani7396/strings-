package listprograms;
/**
 * 27. How to search a word inside a string?
 *
 */
public class M27 {
	public static void main(String[] args) {
		String str = "Hello World";
		String word = "World";
		if (str.contains(word)) {
			System.out.println("The word " + word + " was found in the string.");
		} else {
			System.out.println("The word " + word + " was not found in the string.");
		}
	}
}
