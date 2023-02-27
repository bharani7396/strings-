package pack1;

public class Q12 {
    public static void main(String[] args) {
		String s1 = "abc";
		    //       012  string also internally using index.
		System.out.println(s1);
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
	}
}

// if go to anther character StringIndexOutOfBoundsException will come.