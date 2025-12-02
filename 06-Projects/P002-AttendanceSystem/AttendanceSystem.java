package P002_AttendanceSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceSystem {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> allStudents = new ArrayList<>();
    ArrayList<String> present = new ArrayList<>();
    ArrayList<String> absent = new ArrayList<>();

    private String name;

    public void addStudent() {
        try {
            System.out.print("Enter Your Name: ");
            this.name = sc.nextLine();

            if (name.isEmpty()) {
                System.out.println("Please Enter Student Name ");
            } else if(allStudents.contains(name)) {
                System.out.println("Name is already exists!");
            } else {
                allStudents.add(name);
            }
            System.out.println(name + " added successfully!");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }

    public void markPresent() {
        try {

            System.out.print("Enter student name to mark present: ");
            this.name = sc.nextLine();

            if (!name.isEmpty() && allStudents.contains(name)) {
                if (present.contains(name)) {
                    System.out.println("Attendance already marked");
                    absent.remove(name);
                } else {
                    present.add(name);
                    System.out.println(name + " marked present!");
                }
            } else {
                System.out.println("Invalid Student name given");
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


    }

    public void markAbsent() {
        try {

            System.out.print("Enter student name to mark absent: ");
            this.name = sc.nextLine();

            if (!name.isEmpty() && allStudents.contains(name)) {
                if (absent.contains(name)) {
                    System.out.println("Absent already marked");
                } else {
                    absent.add(name);
                    System.out.println(name + " marked Absent!");
                    present.remove(name);
                }
            } else {
                System.out.println("Invalid Student name given");
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void viewPresent() {
        System.out.println("========= Present Students =========");
        for (String p : present) {
            System.out.println(p);
        }
    }

    public void viewAbsent() {

        System.out.println("========= Absent Students =========");
        for (String a : absent) {
            System.out.println(a);
        }
    }

    public void viewAllStudents() {
        System.out.println("========= All Students =========");
        for (String student : allStudents) {
            System.out.println(student);
        }
    }

    public void calculateAttendance() {
        if (allStudents.isEmpty()) {
            System.out.println("No students in roster!");
            return;
        }

        int total = allStudents.size();
        int presentCount = present.size();
        int absentCount = absent.size();
        int notMarked = total - presentCount - absentCount;

        double attendanceRate = ((double) presentCount / total) * 100;

        System.out.println("\n========= Attendance Report =========");
        System.out.println("Total Students: " + total);
        System.out.println("Present: " + presentCount);
        System.out.println("Absent: " + absentCount);
        System.out.println("Not Marked: " + notMarked);
        System.out.printf("Attendance Rate: %.2f%%\n", attendanceRate);
    }

    public void mainMenu() {
        while (true) {
            System.out.println("\n=== STUDENT ATTENDANCE SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Present");
            System.out.println("3. Mark Absent");
            System.out.println("4. View Present Students");
            System.out.println("5. View Absent Students");
            System.out.println("6. View All Students");
            System.out.println("7. Attendance Report");
            System.out.println("8. Exit");

            System.out.print("\nSelect: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    markPresent();
                    break;
                case "3":
                    markAbsent();
                    break;
                case "4":
                    viewPresent();
                    break;
                case "5":
                    viewAbsent();
                    break;
                case "6":
                    viewAllStudents();
                    break;
                case "7":
                    calculateAttendance();
                    break;
                case "8":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public void startApp() {
        mainMenu();
    }
}
