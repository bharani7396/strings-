package listprograms;

//  2. Write a program to reverse a String with recursive algorithm?
public class M2 {
	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println(rev(s1));
	}

	public static String rev(String s1) {
		if (s1.length() == 0) {
			return "";
		}
		return rev(s1.substring(1)) + s1.charAt(0);
	}
}
 