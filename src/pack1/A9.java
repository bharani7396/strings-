package pack1;

import java.util.Scanner;

public class A9 {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the string");
     String str = sc.nextLine();
     String plainstr = str.replaceAll("[@#$%^&*()_*/!]","");  
                   // A-Za-z0-9 is also given that squre bracket out put is spl chars is came.
     System.out.println(plainstr);
       
	}
}
// given in put is - bharani$#%^@
// out put is -bharani