package pack1;

import java.util.Scanner;


public class Q56 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter email id");
        String email = sc.next();
        int i = email.indexOf('@');
        if(i == -1)
        {
        	System.out.println(email + "invalid.there is no @");
        	return;
        }
		int j = email.indexOf(".", i);
		if(j == -1)
		{
			System.out.println("inter.there is no dot after @");
			return;
		}
		if((i + 1)== j)
		{
			System.out.println(email + "invaild. dot should not be immediatly after @");
			return;
		}
		if(j == email.length()-1)
		{
			System.out.println(email + "invaild. dot should not be at the end");
			return;
		}
        System.out.println(email + " is vaild");
	}
}