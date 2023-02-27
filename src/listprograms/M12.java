package listprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 12. Write a java program to remove all white spaces from a string?
 *
 */
public class M12 {
    public static void main(String[] args) {
		String str = "p ro g ra m";
		Pattern pattern = Pattern.compile("\\w+");
		Matcher match = pattern.matcher(str);
		String result = "";
		while (match.find()) {
			result += match.group();
		}
		System.out.println(result);
	}
}
