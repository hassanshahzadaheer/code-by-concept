package FileIO;

import java.io.*;
import java.util.Scanner;

public class NoteBook {

    public static void main(String[] args) {

        String fileName = "notes.txt";
        Scanner sc = new Scanner(System.in);

        System.out.print("Content: ");

        String content =  sc.nextLine();

        try(BufferedWriter writter = new BufferedWriter(new FileWriter(fileName))) {
            writter.write(content);

            System.out.println("Content has been updated in " + fileName);
        } catch (IOException e) {
            System.out.print("error reading file " + e.getMessage());
        }


        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String lines;

            while ((lines = reader.readLine()) != null) {

                System.out.println(lines);

            }

        } catch (IOException e) {
            System.out.println("error reading file "+ e.getMessage());
        }

    }
}
