package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q39 {
	public static void main(String[] args) {
		String srt = "abc;abc;abc;abc;hello;123";
		String expression = ";";
		Pattern pattern = Pattern.compile(expression);
		Matcher matches = pattern.matcher(srt);

		while(matches.find())
		{
			System.out.println(matches.group() + ":" + matches.start()); 
		}
	}
}
