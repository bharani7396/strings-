package pack1;

import java.util.HashSet;

public class A4 {
	public static void main(String[] args) {
     String str = "geeks for geeks";
     char [] arr =  str.toCharArray();
     System.out.println(firstRepeating(arr));
	}
	static char firstRepeating(char str[])
	{
		HashSet<Character> h = new HashSet<>();
		for(int i = 0; i < str.length-1; i++)
		{
			char c = str[i];
			if(h.contains(c))
			{
				return c;
			}
			else
			{
				h.add(c);
			}
		}
		return '\0';
	}
	
}
