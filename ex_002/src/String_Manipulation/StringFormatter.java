package String_Manipulation;
import java.util.Scanner;

public class StringFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter languages (comma-separated): ");
        String input = sc.nextLine();

        input = input.trim();

        String[] languages = input.split(",");

        String result = "";
        for (int i = 0; i < languages.length; i++) {
            String removeSpace = languages[i].trim();
            result += removeSpace.toUpperCase();
            if (i != languages.length - 1) {
                result += ", ";
            }
        }

        System.out.println("Formatted: " + result);
    }
}
