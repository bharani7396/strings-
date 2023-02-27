package listprograms;
/**
 * 
 *    13. Write a program to check whether given string is a palindrome or not?
 *
 */
public class M13 {
	public static void main(String[] args) {
	    String str = "madam";
	    boolean isPalindrome = true;

	    // Compare characters from start and end of the string
	    for (int i = 0; i < str.length() / 2; i++) {
	      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
	        isPalindrome = false;
	        break;
	      }
	    }

	    // Print the result
	    if (isPalindrome) {
	      System.out.println(str + " is a palindrome.");
	    } else {
	      System.out.println(str + " is not a palindrome.");
	    }
	  }
}
