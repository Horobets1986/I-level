import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter text ");
        String text = scan.nextLine();

        System.out.println(text.replaceAll("\\s", ""));

        System.out.println(isPalindrome(text));
    }
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\S","");
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();

        return text.equalsIgnoreCase(invertedText) ;

    }
}
