package listprograms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *    15. Write a program to check the balance of brackets in the given string?
 *
 */
public class M15 {
    public static void main(String[] args) {
		String str = "(hello world)";
		System.out.println(BracketsBalanced(str));
	}
    
    public  static boolean BracketsBalanced(String str) {
		String openBraces = "<({[";
		char brace;
		boolean isPaired = true;
		List<String> brackets = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			brace = str.charAt(i);
			if (openBraces. indexOf(brace) > -1) {
				brackets.add(brace + "");
			} else {
				switch (brace) {
				case '>':
					isPaired = brackets.remove("<");
					break;
				case ')':
					isPaired = brackets.remove("(");
					break;
				case '}':
					isPaired = brackets.remove("{");
					break;
				case ']':
					isPaired = brackets.remove("[");
					break;
				}
				if (!isPaired) {
					System.out.println("not balanced");
					return isPaired;
				}
			}
		}
		isPaired = brackets.isEmpty() && isPaired;
		if (!isPaired) {
			System.out.println("not balanced");
			return isPaired;
		} else {
			System.out.println("balances");
			return isPaired;
		}
	}
}
	