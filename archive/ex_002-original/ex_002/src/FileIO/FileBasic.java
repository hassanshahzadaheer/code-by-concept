package FileIO;

import java.io.*;
import java.util.Scanner;

public class FileBasic {
    public static void main(String[] args) throws IOException {

        String fileName = "student_data.txt";

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Math Marks: ");
        String ms = sc.nextLine();

        System.out.print("English Marks: ");
        String es = sc.nextLine();

        System.out.print("Computer Marks: ");
        String cs = sc.nextLine();


        if (name.isEmpty() && ms.isEmpty() && es.isEmpty() && cs.isEmpty()) {
            System.out.println("Please write something.");
        } else
        {
            try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(name + ", " + ms + ", " + es + ", " + cs);
                writer.newLine();

                System.out.println("Data written successfully!");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

        }


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading student data:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Student: " + data[0] +
                        ", Scores: " + data[1] + ", " + data[2] + ", " + data[3]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
