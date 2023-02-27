package pack1;

public class Q29 {
	public static void main(String[] args) {
		String s1 = "bharani";
		System.out.println(rev(s1));
	}

	public static String rev(String s1) {
		// System.out.println(s1);
		if (s1.length() == 0) {
			return "";
		}
		// System.out.println(s1);
		return rev(s1.substring(1)) + s1.charAt(0);
	}
}
