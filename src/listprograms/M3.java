package listprograms;

// 3. Write a program to reverse first half separately and 2nd half separately?
public class M3 {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String rev1 = "";
		String rev2 = "";
		for (int i = s1.length()/2-1; i >=0 ; i--)
		{
              rev1 += s1.charAt(i);
		}
		for (int j = s1.length()-1; j >=s1.length()/2 ; j--)
		{
              rev2 += s1.charAt(j);
		}
		System.out.println(rev1 + rev2);
		//System.out.println(rev2);
	}
}
