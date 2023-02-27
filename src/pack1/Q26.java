package pack1;
// string reverse
public class Q26 {
	public static void main(String[] args) {
       String s1 = "bharani";
       String rev = "";
       //String rev1 = "";
       for(int i = s1.length()-1; i>=0; i--)
       {
    	   rev += s1.charAt(i);
    	   
    	   //System.out.println(rev);
       }
       System.out.println(rev);
 /*      for(int i = 0; i< s1.length(); i++)
       {
    	   rev1 = s1.charAt(i) +rev1;
    	   System.out.println(rev1);
       }
    	   
       System.out.println(rev1);
  */
	}
}
