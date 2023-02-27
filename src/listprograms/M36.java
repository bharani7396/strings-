package listprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 36. Write a program to validate hex code format?
 *
 */
public class M36 {
	private static final String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
    private static final Pattern PATTERN = Pattern.compile(HEX_PATTERN);

    public static boolean isValidHexCode(String hexCode) {
        Matcher matcher = PATTERN.matcher(hexCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] hexCodes = { "#FFF", "#123456", "#Ab3", "#G1234" };

        for (String hexCode : hexCodes) {
            System.out.println(hexCode + " is valid: " + isValidHexCode(hexCode));
        }
    }
}







