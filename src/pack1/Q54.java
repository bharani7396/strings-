package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q54 {
	public static void main(String[] args) {
        //String src = "abs";
		String src = "labs";
        System.out.println(src);
        String expression = "^[a-z]";      // ^ is for starting charter  checking. 
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        System.out.println(matches.find());
        
	}
}
