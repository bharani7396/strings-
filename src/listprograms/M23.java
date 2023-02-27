package listprograms;
/**
 *  23. Write a java program to find all permutations of a string?
 */
public class M23 {
	public static void main(String[] args) {
		String str = "bha";
		permutations(str);
	}
	public  static void permutations(String str) {
		permutations(str, 0, str.length() - 1);
		System.out.println(str);
	}

	public static void permutations(String str, int left, int right) {
		if (right == left) {
			System.out.println(str);
		} else {
			for (int i = left; i <= right; i++) {
				str = swap(str, left, i);
				permutations(str, left + 1, right);
				str = swap(str, left, i);
			}
		}
	}
	public  static String swap(String str, int i, int j) {
		char[] chars = str.toCharArray();
		char ch  = chars[i];
		chars[i] = chars[j];
		chars[j] = ch; 
		return String.valueOf(chars);
	}
}
