package listprograms;
/**
 * 37. Write a program to validate image file extension?
 *
 */
public class M37 {
	private static final String[] ALLOWED_EXTENSIONS = { "jpg", "jpeg", "png", "gif" };

    public static boolean isValidImageFile(String fileName) {
        for (String extension : ALLOWED_EXTENSIONS) {
            if (fileName.endsWith("." + extension)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] fileNames = { "image.jpg", "picture.png", "icon.gif", "file.txt" };

        for (String fileName : fileNames) {
            System.out.println(fileName + " is a valid image file: " + isValidImageFile(fileName));
        }
    }
}

