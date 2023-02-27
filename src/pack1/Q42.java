package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q42 {
	public static void main(String[] args) {
        String srt = "a1b2c3d4hello6";
        String expression = "[146]";
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(srt);
        
        while(matches.find())
        {
        	System.out.println(matches.group() + ":" + matches.start()); 
        }
	}
}
