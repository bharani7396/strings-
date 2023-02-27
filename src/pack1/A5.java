package pack1;

import java.util.HashSet;

public class A5 {
	public static void main(String[] args) {
	     String str = "geeks for geeks";
	     System.out.println(firstRepeating(str));
		}
		static char firstRepeating(String str)
		{
			for(int i = 0; i < str.length()-1; i++)
			{
				char c = str.charAt(i);
				if(str.indexOf(c, i + 1) > 0)
				{
					return c;
				}
			}
			return '\0';
		}
}
