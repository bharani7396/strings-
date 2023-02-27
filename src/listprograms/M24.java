package listprograms;
/**
 * 24. How do you find first repeated and non-repeated character in the given string in java?
 *
 */
public class M24 {
    public static void main(String[] args) {
		String str = "program";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(str.substring(i+1).contains(ch + "")) {
				System.out.println("first repeated: " + ch);
				break;
			}
		}
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!str.substring(i+1).contains(ch + "")) {
				System.out.println("first non repeated: " + ch);
				break;
			}
		}
	}
}
