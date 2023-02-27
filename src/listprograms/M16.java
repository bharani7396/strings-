package listprograms;

import java.util.HashMap;
import java.util.Set;

/**
 * 
 * 16. Write a java program to find duplicate characters in a string?
 *
 */
public class M16 {
	public static void main(String[] args) {
		String str = "hello world";
		HashMap<Character, Integer> charCount = new HashMap<>();

		// Iterate through the characters of the string
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// If the character is already in the HashMap, increment its count
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				// Otherwise, add the character to the HashMap with a count of 1
				charCount.put(c, 1);
			}
		}

		// Iterate through the HashMap and print the duplicate characters and their count
		for (char c : charCount.keySet()) {
			if (charCount.get(c) > 1) {
				System.out.println(c + ": " + charCount.get(c));
			}
		}
	}
}
