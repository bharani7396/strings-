package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q48 {
	public static void main(String[] args) {
        String srt = "abcxyz hello 123";
        String expression = "\\s";
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(srt);
        
        while(matches.find())
        {
        	System.out.println(matches.group() + ":" + matches.start()); 
        }
	}
}
