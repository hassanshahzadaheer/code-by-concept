package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogEntry {

    private String timestamp;
    private String ipAddress;
    private String httpMethod;
    private String url;
    private String statusCode;
    private String fileName = "access_log.txt";

    public LogEntry(String timestamp, String ipAddress, String httpMethod, String url, String statusCode) {

        this.timestamp = timestamp;
        this.ipAddress = ipAddress;
        this.httpMethod = httpMethod;
        this.url = url;
        this.statusCode = statusCode;

    }

    private void parseLogLine(String line) {

        try(BufferedReader reader = new BufferedReader(new FileReader(this.fileName))) {

            System.out.println("Reading File");
            while ((line = reader.readLine())  != null) {
                String[] logs = line.substring(1, line.length() - 1).split("\\] \\[");

                if (line.equals("[MALFORMED_ENTRY_HERE]")) {
                    return;
                }

                for (String log : logs) {
                    System.out.println(log);
                }

            }


        } catch (IOException e) {
            System.out.println("Error while process: " + e.getMessage());
        }
    }


    public static void main(String[] args) {

         String fileName = "access_log.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String lines;
            System.out.println("Reading File");
            while ((lines = reader.readLine())  != null) {
                String[] logs = lines.substring(1, lines.length() - 1).split("\\] \\[");

                if (lines.equals("[MALFORMED_ENTRY_HERE]")) {
                    return;
                }

                for (String log : logs) {
                    System.out.println(log);
                }

            }


        } catch (IOException e) {
            System.out.println("Error while process: " + e.getMessage());
        }
    }
}
