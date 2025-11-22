package FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "user_info.txt";

        Scanner sc = new Scanner(System.in);
        System.out.print("content: ");
        String userInput = sc.nextLine();

        if (userInput.isEmpty()) {
            System.out.println("Please write something.");
        } else
        {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                writer.write(userInput);
                System.out.println("Content updated to " + fileName);
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

        }


    }
}
