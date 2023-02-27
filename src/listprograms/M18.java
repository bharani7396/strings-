package listprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 *  18. Write a java program to reverse a given string with preserving the 
         position of spaces?
 *
 */
public class M18 {
	public static String reverse(String str) {
		// Create an array of characters
		char[] charArray = str.toCharArray();

		// Iterate through the array and reverse the characters
		int i = 0;
		int j = charArray.length - 1;
		while (i < j) {
			if (charArray[i] == ' ') {
				i++;
			} else if (charArray[j] == ' ') {
				j--;
			} else {
				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
				i++;
				j--;
			}
		}

		// Return the reversed string
		return new String(charArray);
	}

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reverse(str));
	}
}




