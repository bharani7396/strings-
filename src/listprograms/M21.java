package listprograms;

import java.util.HashSet;

/**
 * 21. How do you find longest substring without repeating characters in the given string?
 *
 */
public class M21 {
	public static int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		int start = 0;
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			while (set.contains(c)) {
				set.remove(s.charAt(start));
				start++;
			}

			set.add(c);
			maxLength = Math.max(maxLength, i - start + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println("Longest substring without repeating characters: " + lengthOfLongestSubstring(str));
	}
}

