package pack1;

public class A1 {
	public static void main(String[] args) {
		   /* String s1 = "java";
		    String s2 = "ja";
		    String s3 = "va";
		

		    String s4 = "ja" + s3;
		    String s5 = s2 + "va";
		    String s6 = s2 + s3;

		    System.out.println(s1 == s4);
		    System.out.println(s1 == s5);
		    System.out.println(s1 == s6);
		    System.out.println(s4 == s5);
            System.out.println(s4 == s6);
		    System.out.println(s5 == s6);*/
		
		   /* String s1 = "abc";
		    System.out.println(s1);
		    
		    String s2 = s1.concat("xyz");  // concat method internally using + operator.
		    System.out.println(s1);
		    System.out.println(s2);*/
		
		   /* String s1 = "abc";
		    System.out.println(s1);   // still s1 pointing only abc 
		    s1.concat("xyz");
		    System.out.println(s1);*/
		    
		    /*String s1 = "java";
		    String s2 = "ja".concat("va");
		    
		    System.out.println(s1 == s2);*/
	}
}
/*                      

    String s1 = "abc";
    String s2 = "abc";
    sop(s1 == s2);         // true        object is creating inside a pool that ==  true (consent  pool)
    sop(s1.equals(s2));     // true       equals method is checking object content. that why equals method is true.


    String s1 = "abc";
    String s2 = new String("abc");
    sop(s1 == s2);           false         it is non - consent pool that why its false.it is checking as a object location
    sop(s1.equals(s2));      true

    String s1 = new String("abc");
    String s2 = new String("abc");
    sop(s1 == s2);                   // false
    sop(s1.equals(s2));              // true     total number of object are 3

     String s1 = "java";
    String s2 = "ja" + "va";
    sop(s1 == s2);           true   in this case total 3 object are created but reference is same object.
    sop(s1.equals(s2));      true

    String s1 = "java";
    String s2 = "ja";
    String s3 = "va";

    String s4 = "ja" + s3;
    String s5 = s2 + "va";
    String s6 = s2 + s3;

    sop(s1 == s4);  // false
    sop(s1 == s5);   // false
    sop(s1 == s6);   // false
    sop(s4 == s5);  // false
    sop(s4 == s6);   // false
    sop(s5 == s6);   // false


 */