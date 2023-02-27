package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q55 {
	public static void main(String[] args) {
        //String src = "abs";
		String src = "labs1";
        System.out.println(src);
        String expression = "[a-z]$";      // $ Represents  ending character.   
        Pattern pattern = Pattern.compile(expression);
        Matcher matches = pattern.matcher(src);
        System.out.println(matches.find());
        
	}
}
