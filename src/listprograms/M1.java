package listprograms;
/**
 * 1. Write a program to reverse a String
 *
 */
public class M1 {
     public static void main(String[] args) {
		String s1 = "Hello World";
		String rev = "";
	    for (int i = s1.length() -1; i>= 0; i-- ) 
	    {
			rev += s1.charAt(i);
		}	
	    System.out.println(rev);
	
	}
}
