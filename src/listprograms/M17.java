package listprograms;

/**
 * 
 * 17. Write a java program to check whether one string is a rotation of
 * another?
 *
 */
public class M17 {
	public static boolean isRotation(String s1, String s2) {
		// Check if the strings have the same length
		if (s1.length() != s2.length()) {
			return false;
		}

		// Concatenate the first string with itself
		String s1s1 = s1 + s1;

		// Check if the second string is a substring of the concatenated string
		return s1s1.contains(s2);
	}

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "llohe";
		if (isRotation(s1, s2)) {
			System.out.println(s2 + " is a rotation of " + s1);
		} else {
			System.out.println(s2 + " is not a rotation of " + s1);
		}
	}
}


