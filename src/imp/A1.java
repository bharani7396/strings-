package imp;
/**
 * reverse the given String with out using any built-in method from String class.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1 {
    public static void main(String[] args) {
		String str = "bharani";
		String result = "";
		Pattern pattern = Pattern.compile("\\S");
		Matcher match = pattern.matcher(str);
		while (match.find()) {
			result = match.group() + result;
		}
		System.out.println(result);
	}
}
