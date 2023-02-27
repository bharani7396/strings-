package pack1;

public class A6 {
	public static void main(String[] args) {
		String str = "Hello, World!";

		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if (Character.isLetterOrDigit(c))
			{
				reversed += c;
			} 
			else
			{
				reversed = c + reversed;
			}
		}
       System.out.println(reversed);
	}
}
