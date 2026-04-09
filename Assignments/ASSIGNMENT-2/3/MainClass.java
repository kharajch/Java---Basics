
import java.util.Scanner;

// 3.WAP in Java to create a class named Student with attributes name (str), rollnumber (Short) and grade (char). Implement Multiple Constructor : a default constructor, a constructor that takes name and roll number, a constructor that takes all three values, create different shortcut objects using different constructor and point their details.

class Student {
    String name;
    int rollnumber;
    String grade;

    public Student() {

    }

    public Student(String n, int r) {
        name = n;
        rollnumber = r;

    }

    public Student(String n, int r, String g) {
        name = n;
        rollnumber = r;
        grade = g;

    }

    public String getName() {
        return name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public String getGrade() {
        return grade;
    }

}

public class MainClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Student s1 = new Student();
        System.err.println("Student 1 Details :");
        System.out.println("Name : " + s1.name);
        System.out.println("Roll No. : " + s1.rollnumber);
        System.out.println("Grade : " + s1.grade);

        System.err.println("");
        System.err.println("Student 2 Details :");
        Student s2 = new Student("Kharaj Chakraborty", 12345678);
        System.out.println("Name : " + s2.name);
        System.out.println("Roll No. : " + s2.rollnumber);
        System.out.println("Grade : " + s2.grade);

        System.out.println("");
        System.err.println("Enter Student 3 Details :");
        System.out.print("Name : ");
        String n = sc.next();
        System.out.print("Roll Number : ");
        int r = sc.nextInt();
        System.out.print("Grade : ");
        String g = sc.next();

        System.out.println("");
        System.err.println("Enter Student 3 Details :");
        Student s3 = new Student(n, r, g);
        System.out.println("Name : " + s3.name);
        System.out.println("Roll No. : " + s3.rollnumber);
        System.out.println("Grade : " + s3.grade);

    }
}
