package listprograms;
/**
 *  Write a program to validate specified username format?
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M34 {
	private static final String USERNAME_REGEX = "^[a-zA-Z0-9._-]{3,}$";
	private static final Pattern PATTERN = Pattern.compile(USERNAME_REGEX);

	public static boolean validate(String username) {
		Matcher matcher = PATTERN.matcher(username);
		return matcher.matches();
	}
	public static void main(String[] args) {
		String username = "myusername";
		boolean isValid = M34.validate(username);
		if (isValid) {
			System.out.println(username + " is valid.");
		} else {
			System.out.println(username + " is not valid.");
		}
	}
}
