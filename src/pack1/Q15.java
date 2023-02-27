package pack1;

public class Q15 {
	public static void main(String[] args) {
       String s1 = "abcabcabcabc";
                 // 0123456789
       System.out.println(s1.indexOf('a'));
       System.out.println(s1.indexOf('b'));
       System.out.println(s1.indexOf('c'));
       System.out.println(s1.indexOf('c',7));
       System.out.println(s1.indexOf('b',7));
       System.out.println(s1.indexOf('a',7));
       System.out.println(s1.indexOf('c',2));
       System.out.println(s1.indexOf('b',2));
       System.out.println(s1.indexOf('c',2));
	}
}


/*
    int java.lang.String.indexOf(int ch, int fromIndex)
   Returns the index within this string of the first occurrence of the specified character,
  starting the search at the specified index. 
   
*/