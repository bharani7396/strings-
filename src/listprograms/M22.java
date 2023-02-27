package listprograms;
/**
 * 
 * 22. How do you swap two string variables without using third or temp 
            variable in java?
 *
 */
public class M22 {
	public static void main(String[] args) {
		String s1 = "bharani";
		String s2 = "chintu";

		s1 = s1 + s2;
		s2 = s1.substring(0, (s1.indexOf(s2)));
		s1 = s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);

	}
}
