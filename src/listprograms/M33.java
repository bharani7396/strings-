package listprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 33. Write a program to validate phone number format?
 */
public class M33 {
    private static final String PHONE_REGEX = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
    private static final Pattern PATTERN = Pattern.compile(PHONE_REGEX);

    public static boolean validate(String phoneNumber) {
        Matcher matcher = PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
    	
    	String phoneNumber = "7396212236";
    	boolean isValid = M33.validate(phoneNumber);
    	if (isValid) {
    	    System.out.println(phoneNumber + " is valid.");
    	} else {
    	    System.out.println(phoneNumber + " is not valid.");
    	}
	}
}

