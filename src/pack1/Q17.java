package pack1;

public class Q17 {
    public static void main(String[] args) {
		String s1 = "abcabcabcabc";
		//           0123456789
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf('b'));
		System.out.println(s1.lastIndexOf('c', 7));
		System.out.println(s1.lastIndexOf('a', 7));
		System.out.println(s1.lastIndexOf('b', 7));
		System.out.println(s1.lastIndexOf('c', 3));
		System.out.println(s1.lastIndexOf('a', 3));
		System.out.println(s1.lastIndexOf('b', 3));
	
	}
}

/*
   int java.lang.String.lastIndexOf(int ch, int fromIndex)
Returns the index within this string of the last occurrence of the specified character,
 searching backward starting at the specified index. For values of ch in the range from 
 0 to 0xFFFF (inclusive), the index returned is the large stvalue k such that:
 
 lastIndexOf it the searching from right to left.
*/