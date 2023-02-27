package listprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class   M31 {
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);

    public static boolean validate(String email) {
        Matcher matcher = PATTERN.matcher(email);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
    	String email = "example@gmail.com";
    	boolean isValid = M31.validate(email);
    	if (isValid) {
    	    System.out.println(email + " is valid.");
    	} else {
    	    System.out.println(email + " is not valid.");
    	}
	}
}
  
  

