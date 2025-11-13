package ArrayList;

public class Student {

    private String name;
    private double grade;
    private String subject;

    Student(String name, double grade, String subject) {
        this.name = name;
        this.grade = grade;
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displayStudents() {
        System.out.println(name + " - " + subject + " " + grade);
    }

}
