package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q52 {
	public static void main(String[] args) {
        String srt = "123 abc hello";
        String expression = "\\S";         
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(srt);
        
        while(matches.find())
        {
        	System.out.println(matches.group() + ":" + matches.start()); 
        }
	}
}
