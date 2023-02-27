package listprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 35. Write a program to validate specified password format?
 *
 */
public class M35 {
	private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
	private static final Pattern PATTERN = Pattern.compile(PASSWORD_REGEX);

	public static boolean validate(String password) {
		Matcher matcher = PATTERN.matcher(password);
		return matcher.matches();
	}
	public static void main(String[] args) {
		String password = "MyPassw0rd@";
		boolean isValid = M35.validate(password);
		if (isValid) {
			System.out.println("The password is valid.");
		} else {
			System.out.println("The password is not valid.");
		}
	}
}
