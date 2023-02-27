package listprograms;

public class M101 {
	public static void main(String[] args) {
        String text = "hello world hij";
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String first = word.substring(0,1).toUpperCase();
            String last = word.substring(word.length()-1).toUpperCase();
            String middle = word.substring(1, word.length()-1).toLowerCase();
            result.append(first + middle + last + " ");
        }
        System.out.println(result.toString().trim());
    }
}
