package listprograms;
// 8. Write a program to reverse the given string word wise?
public class M8 {
     public static void main(String[] args) {
		String str = "Hello world to the lara";
		String[] strArr = str.split(" ");
		int j = strArr.length - 1;
		String temp;
		str = "";
		for (int i = 0; i < strArr.length / 2; i++, j--) {
			temp = strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = temp;
		}
		for (int i = 0; i < strArr.length; i++) {
			str += strArr[i];
			if (i != strArr.length - 1) {
				str += " ";
			}
		}
		System.out.println(str);
	}
}
