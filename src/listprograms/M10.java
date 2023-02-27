package listprograms;
/**
 * 
 *10. Write a java program to count the total number of occurrences of a 
          given character in a string?
 *
 */
public class M10 {
    public static void main(String[] args) {
    	String str = "bharani";
    	int count = 0;
    	char c = 'a';
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
