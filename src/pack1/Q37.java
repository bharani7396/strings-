package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q37 {
	public static void main(String[] args) {
        String srt = "abcabcabcabc";
        String expression = "abc";
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(srt);
        
        while(matches.find())
        {
        	System.out.println(matches.group() + ":" + matches.start()); // starting of the index number
        }
	}
}
