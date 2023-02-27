package listprograms;
/**
 * 
 *    9. Rotate the string word wise by one?
 *
 */
public class M9 {
	public static void main(String[] args) {
		String str = "Hello world to the lara";
		String word = str.substring(0, str.indexOf(' '));
		str = str.substring(str.indexOf(' ') + 1);
		str += " " + word;
		System.out.println(str);
	}
}
