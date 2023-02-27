package listprograms;

import java.util.HashMap;
import java.util.Set;

/**
 * 
 * 7. Write a java program to find the duplicate words and their number of 
            occurrences in a string?
 *
 */
public class M7 {
	public static void main(String[] args) {
		String str = "This is a test string. This is a test string."; 
		String[] words = str.split(" ");      // Split the string into words
		HashMap<String, Integer> wordCount = new HashMap<>();   // Create a HashMap to store the word and its count
		for (String word : words)              // Iterate through the words
		{           
			if (wordCount.containsKey(word))     // If the word is already in the HashMap, increment its count
			{     
				wordCount.put(word, wordCount.get(word) + 1);
			} 
			else                               // Otherwise, add the word to the HashMap with a count of 1
			{                           
				wordCount.put(word, 1);
			}
		} 
		for (String word : wordCount.keySet())
		{       
			if (wordCount.get(word) > 1) 
			{
				System.out.println(word + ": " + wordCount.get(word));
			}
		}
	}
}





