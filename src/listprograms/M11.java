package listprograms;

import java.util.HashMap;

/**
 * 
 *     11. Write a java program to count the number of occurrences of each
               character in a string?
 *
 */
public class M11 {
    public static void main(String[] args) {
		String str = "hello world";
		HashMap<Character, Integer> map = new HashMap<>();
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch != ' ') {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
		}
		System.out.println(map);
	}
}
