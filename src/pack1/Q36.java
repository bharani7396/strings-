package pack1;
// by using split () method one string to multiple string
public class Q36 {
     public static void main(String[] args) {
		String s1 = "abc xyz hello test 123 java";
		String[] strings = s1.split(" ");
		for(String string : strings)
		{
			System.out.println(string);
		}
	}
}
