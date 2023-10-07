import java.util.Scanner;

public class task2 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter text ");
        String str = scan.nextLine();

        String words = str ;
        int countWords = words.split("\\s").length;
        System.out.println("word is - " +countWords);

    }
}