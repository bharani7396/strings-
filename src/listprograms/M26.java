package listprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class M26 {
	public static void main(String[] args) throws IOException {
	    String filePath = "E:\\data.csv";
	    HashMap<String, Integer> wordCount = new HashMap<>();

	    BufferedReader reader = new BufferedReader(new FileReader(filePath));
	    String line;

	    while ((line = reader.readLine()) != null) {
	      String[] words = line.split(" ");

	      for (String word : words) {
	        if (wordCount.containsKey(word)) {
	          wordCount.put(word, wordCount.get(word) + 1);
	        } else {
	          wordCount.put(word, 1);
	        }
	      }
	    }
	    reader.close();

	    String mostRepeatedWord = "";
	    int maxCount = 0;
	    for (String word : wordCount.keySet()) {
	      if (wordCount.get(word) > maxCount) {
	        maxCount = wordCount.get(word);
	        mostRepeatedWord = word;
	      }
	    }

	    System.out.println("The most repeated word is: " + mostRepeatedWord);
	    System.out.println("Number of times repeated: " + maxCount);
	  }
	}






