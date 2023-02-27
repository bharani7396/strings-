package listprograms;
//4. Write a program to rotate one char in a given string
public class M4 {
	public static void main(String[] args) {
		String s1 = "helloworld";
		char [] c1 = s1.toCharArray();
		char temp = c1[0];
		for (int i = 0; i < c1.length-1; i++)
		{
            c1[i] = c1[i+1];
		}
		c1[c1.length -1 ] = temp;
		System.out.println(c1);
	}
}
