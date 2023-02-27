package listprograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 32. Write a program to validate date format?
 *
 */
public class M32 {
	 private static final String DATE_FORMAT = "dd/MM/yyyy";

	    public static boolean validate(String date) {
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	            sdf.setLenient(false);
	            sdf.parse(date);
	            return true;
	        } catch (ParseException e) {
	            return false;
	        }
	    }
	    public static void main(String[] args) {
	    	String date = "19/01/2023";
	    	boolean isValid = M32.validate(date);
	    	if (isValid) {
	    	    System.out.println(date + " is valid.");
	    	} else {
	    	    System.out.println(date + " is not valid.");
	    	}
		}
}
