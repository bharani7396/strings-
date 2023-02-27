package pack1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A8 {
	public static void main(String[] args) {
		/*String srt = "%$#bharani";
		String expression = "!@#$%^&*()/*";
		
		Pattern pattern = Pattern.compile(expression);
		Matcher matches = pattern.matcher(srt);

		while(matches.find())
		{
			
		}*/
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();*/
		String str = "$#%BHAGT*&(";
		String spl = "";
		
		for(int i = 0; i <= str.length()-1; i++)
		{
			if(str.charAt(i)>= 64 && str.charAt(i)<= 122)
			{
				spl = spl+str.charAt(i);
			}
		}
		System.out.println(spl);
	}
}
