package listprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 28. How to remove html tags from a string
 *
 */
public class M28 {
	public static String removeHtmlTags(String html) {
		String regex = "<[^>]*>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(html);
		return matcher.replaceAll("");
	}

	public static void main(String[] args) {
		String html = "<p>Hello <b>World</b></p>";
		String text = removeHtmlTags(html);
		System.out.println("HTML: " + html);
		System.out.println("Text: " + text);
	}
}





