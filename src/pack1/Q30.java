package pack1;

public class Q30 {
	public static void main(String[] args) {
		
		String s1 = "abchelloxyzabchelloxyz";
		
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("hello"));
		System.out.println(s1.indexOf("xyz"));
		System.out.println(s1.indexOf("test"));
		System.out.println(s1.indexOf("abcd"));
		System.out.println(s1.indexOf("abc", 5));
		System.out.println(s1.indexOf("xyz", 5));
		System.out.println(s1.indexOf("hello", 5));
		System.out.println(s1.indexOf("abc", 15));
	}
}
