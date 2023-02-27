package pack1;

public class Q23 {
	public static void main(String[] args) {
		String s1 = "hello";
		s1.concat("test");  
		System.out.println(s1);
	}
}

 // concat method internally using + operator.


/*
 
    String java.lang.String.concat(String str)
Concatenates the specified string to the end of this string. 

If the length of the argument string is 0, then this String object is returned.
 Otherwise, a String object is returned that represents a character sequence that is the 
 concatenation of the character sequence represented by this String object and the
  character sequence represented by the argument string.


*/