package imp;

import java.util.Scanner;
/**
 *    intput = hello 
 *             java
 *    output = 9
 *             No
 *             Hello Java         
 * 
 */
public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String A = sc.next();
		String B = sc.next();
		String C = A + B;
		System.out.println(C.length());
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		String s1 = A.substring(0, 1).toUpperCase() + A.substring(1);
		String s2 = B.substring(0, 1).toUpperCase() + B.substring(1);

		System.out.println(s1 + " " + s2);
	}
}
