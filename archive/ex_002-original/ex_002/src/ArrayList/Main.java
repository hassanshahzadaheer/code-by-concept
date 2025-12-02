package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<>();

        student.add (new Student("Aheer", 94.4, "English"));
        student.add (new Student("Sara", 88.9, "Mathematics"));
        student.add (new Student("Ali", 76.5, "Computer Science"));
        student.add (new Student("Noor", 91.2, "Computer Science"));
        student.add (new Student("Hamza", 83.7, "History"));
        student.add (new Student("Fatima", 95.0, "Computer Science"));
        student.add (new Student("Usman", 97.8, "Mathematics"));
        student.add (new Student("Maya", 87.3, "Computer Science"));
        student.add (new Student("Bilal", 90.1, "History"));
        student.add (new Student("Zara", 85.6, "Mathematics"));

        int mathStudent = 0;
        double mathTotal = 0.0f;
        double avg = 0.0f;
        double topper = student.get(0).getGrade();


        System.out.println("========= Only Math Students =========");
        for (Student students : student) {
            if (students.getSubject().equals("Mathematics")) {
                students.displayStudents();
                mathTotal += students.getGrade();
                mathStudent ++;
            }

            if(students.getGrade() > topper) {
                topper = students.getGrade();
            }

        }
        avg = mathTotal / mathStudent;
        System.out.println("Total Math Students: " + mathStudent);
        System.out.printf("Average : %.2f\n",avg);

        System.out.println("========= Topper =========");
        for (int i = 0; i < student.size(); i ++) {
            if (student.get(i).getGrade() == topper) {
                student.get(i).displayStudents();
            }
        }

        int counterEnglish = 0;
        int counterMathematics = 0;
        int counterCS = 0;
        int counterHistory = 0;

        for (int i = 0;  i < student.size(); i ++) {

            switch (student.get(i).getSubject()) {
                case "English":
                    counterEnglish ++;
                    break;
                case "Mathematics":
                    counterMathematics ++;
                    break;
                case "Computer Science":
                    counterCS ++ ;
                    break;
                case "History":
                    counterHistory ++ ;
                    break;
                default:
                    System.out.println("No Category");

            }

        }
        System.out.println("\n========= Subject Statistics =========");
        System.out.println("English: " + counterEnglish);
        System.out.println("Mathematics: " + counterMathematics);
        System.out.println("Computer Science: " + counterCS);
        System.out.println("History: " + counterHistory);

    }
}
