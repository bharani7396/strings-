package listprograms;
/**
 * 20. Write a java program to find the percentage of uppercase letters, 
     lowercase letters, digits and special characters in a given string?
 *
 */
public class M20 {
	public static void main(String[] args) {
       String str = "BharJJh @#125";
       int n, upChars, lowChars, nums, splChars;
		char ch;
		upChars = lowChars = nums = splChars = 0;
		n = str.length();
		for (int i = 0; i < n; i++)
		{
			ch = str.charAt(i);
			if (Character.isUpperCase(ch)) 
			{
				upChars++;
			} 
			else if (Character.isLowerCase(ch)) 
			{
				lowChars++;
			}
			else if (Character.isDigit(ch))
			{
				nums++;
			}
			else
			{
				splChars++;
			}
		}
		System.out.printf("Percentage of letters: %.2f\n", ((upChars * 100.0) / n));
		System.out.printf("Percentage of letters: %.2f\n", ((lowChars * 100.0) / n));
		System.out.printf("Percentage of digits: %.2f\n", ((nums * 100.0) / n));
		System.out.printf("Percentage of special characters: %.2f\n", ((splChars * 100.0) / n));
	}
}
