package listprograms;
// 5. Find out length of the string without length() method of a String?

public class M5 {
	public static void main(String[] args) {
       String s1 = "HelloWorld";
       System.out.println(s1);
       System.out.println("length:" + (s1 + 'b').lastIndexOf('b'));
       
	}
}
