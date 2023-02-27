package listprograms;

import java.util.Arrays;

/**
 * 
 *      14. Write a program to check whether given two strings are anagrams?
 *
 */
public class M14 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		
		str1 = str1.toLowerCase();                        // Convert the strings to lowercase
		str2 = str2.toLowerCase();

		char[] chars1 = str1.toCharArray();           // Sort the characters of both strings
		Arrays.sort(chars1);
		str1 = new String(chars1);

		char[] chars2 = str2.toCharArray();
		Arrays.sort(chars2);
		str2 = new String(chars2);

		
		if (str1.equals(str2)) {                            // Compare the sorted strings
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
}
