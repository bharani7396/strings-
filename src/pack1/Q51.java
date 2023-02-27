package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q51 {
	public static void main(String[] args) {
        String srt = "hello1abc_test$38%test@hello";
        String expression = "\\W";         
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(srt);
        
        while(matches.find())
        {
        	System.out.println(matches.group() + ":" + matches.start()); 
        }
	}
}
