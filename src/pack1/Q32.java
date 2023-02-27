package pack1;

import java.util.Scanner;
/**
 * 
 * 
 * input is give like that = bharani  chintu  hello world
 * out put is bharani
 *            chintu
 *            hello
 *            world
 * 
 *
 */
public class Q32 {
	public static void main(String[] args) {
		System.out.println("enter line of chars");
		Scanner sc = new Scanner(System.in);
     	String line = sc.nextLine();  // abc xyz hello
     	                              // 0123456789
		int fromIndex = 0, toIndex = line.indexOf(' ');
		String word;
		while(toIndex != -1)
		{
			word = line.substring(fromIndex, toIndex);
			System.out.println(word);
			fromIndex = toIndex + 1;
			toIndex = line.indexOf(' ' , fromIndex);
		}
		word = line.substring(fromIndex );
		System.out.println(word);
	} 
}


  //String car= "";
/**	for(int i = 0; i < line.length(); i++)
{ 
	if(line.charAt(i) == ' ')
	{
		System.out.println(car);
		car= "";
		i++;
	}
	car+= line.charAt(i);
}
System.out.println(car); */




