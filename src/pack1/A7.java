package pack1;

import java.util.Arrays;
import java.util.Scanner;

// reverse the word not spl characters in the given string.
public class A7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ant string");
		String s1 = sc.next();
		char[] ch = s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		reverse(ch);
		String s2 = new String(ch);
		System.out.println(ch);
	}
	public static void reverse(char s[])
	{

		int i = 0; 
		int j = s.length -1;
		while(i < j)
		{
			if( !Character.isAlphabetic(s[i]))  //  isLetterOrDigit
			{
				i++;
			}
			else if(! Character.isAlphabetic(s[j]))
			{
				j--;
			}
			else
			{
				char temp = s[j];
				s[j] = s[i];
				s[i] = temp;
				i++;
				j--;
			}
		}
	}
}
