package pack1;

public class Q31 {
	public static void main(String[] args) {
		
		String s1 = "abchelloxyzabchelloxyz";
		
		System.out.println(s1.lastIndexOf("abc"));
		System.out.println(s1.lastIndexOf("hello"));
		System.out.println(s1.lastIndexOf("xyz"));
		System.out.println(s1.lastIndexOf("test"));
		System.out.println(s1.lastIndexOf("abcd"));
		System.out.println(s1.lastIndexOf("abc", 10));
		System.out.println(s1.lastIndexOf("xyz", 10));
		System.out.println(s1.lastIndexOf("hello", 5));
		System.out.println(s1.lastIndexOf("abc", 10));
		System.out.println(s1.lastIndexOf("abc", 1));
	}
}
