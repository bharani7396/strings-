package listprograms;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *  25. How do you find the number of characters, words and lines in the given text file in java?
 */
public class M25 {
	 public static void main(String[] args) {
		    try {
		      // Open the file
		      FileInputStream fstream = new FileInputStream("E:\\data.csv");
		      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		      // Initialize counters
		      int charCount = 0;
		      int wordCount = 0;
		      int lineCount = 0;

		      // Read file line by line
		      String line;
		      while ((line = br.readLine()) != null) {
		        // Update character count
		        charCount += line.length();

		        // Update word count
		        String[] words = line.split(" ");
		        wordCount += words.length;

		        // Update line count
		        lineCount++;
		      }

		      // Close the input stream
		      br.close();

		      // Print the character, word, and line counts
		      System.out.println("Number of characters in the file: " + charCount);
		      System.out.println("Number of words in the file: " + wordCount);
		      System.out.println("Number of lines in the file: " + lineCount);
		    } catch (Exception e) {
		      // Print an error message if there is an exception
		      System.err.println("Error: " + e.getMessage());
		    }
	 }
}



		
