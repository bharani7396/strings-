package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q53 {
	public static void main(String[] args) {
        String srt = "a1b2c3d4";
        String expression = "\\D";         
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(srt);
        
        while(matches.find())
        {
        	System.out.println(matches.group() + ":" + matches.start()); 
        }
	}
}
