package listprograms;
  // 6. Find out how many words are there in a given string?

public class M6 {
    public static void main(String[] args) {
		String s1 = "Hello World of people";
		String[] s2 = s1.split(" ");
		for(String s3 : s2)
		{
			System.out.println(s3);
		}
	   System.out.println(s2.length);
	}
}
