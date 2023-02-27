package pack1;
// c index number will be given output.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q38 {
	public static void main(String[] args) {
        String srt = "abcabcabcabc";
        String expression = "c";   
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(srt);
        
        while(matches.find())
        {
        	System.out.println(matches.group() + ":" + matches.start()); 
        }
	}
}
