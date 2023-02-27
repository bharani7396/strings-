package listprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *   19. Write a java program to reverse each word of a given string?
 */
public class M19 {
	public static String reverseWords(String str) {
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();

		for (String word : words) {
			StringBuilder reversed = new StringBuilder(word);
			reversed.reverse();
			sb.append(reversed);
			sb.append(" ");
		}
		// remove the last space
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("Original String: " + str);
		System.out.println("Reversed Words: " + reverseWords(str));
	}
}

