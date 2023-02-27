package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q47 {
	public static void main(String[] args) {
        String srt = "a123b234c567e3045";
        String expression = "\\d+";
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(srt);
        
        while(matches.find())
        {
        	System.out.println(matches.group() + ":" + matches.start()); 
        }
	}
} 
