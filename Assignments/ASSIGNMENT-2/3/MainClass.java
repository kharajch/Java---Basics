
import java.util.Scanner;

// 3.WAP in Java to create a class named Student with attributes name (str), rollnumber (Short) and grade (char). Implement Multiple Constructor : a default constructor, a constructor that takes name and roll number, a constructor that takes all three values, create different shortcut objects using different constructor and point their details.

class Student {
    String name;
    int rollnumber;
    char grade;

    public Student() {

    }

    public Student(String n, int r) {
        name = n;
        rollnumber = r;

    }

    public Student(String n, int r, char g) {
        name = n;
        rollnumber = r;
        grade = g;

    }

    public void setdata(String name, int rollnumber, char grade) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
    }

    public void setdata(char grade) {
        this.grade = grade;
    }

}

public class MainClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        System.out.printf(
                "1. Using Default Constructor. \n 2. Using Constructor With Name And Roll No. \n 3. Using Constructor With Name, Roll Number And Grade. \n Enter Option : ");

        op = sc.nextInt();

        switch (op) {
            case 1:
                Student s1 = new Student();
                System.err.println("Enter Student Details :");
                System.out.print("Name : ");
                String n1 = sc.next();
                System.out.print("Roll Number : ");
                int r1 = sc.nextInt();
                System.out.print("Grade : ");
                char g1 = sc.next().charAt(0);
                s1.setdata(n1, r1, g1);
                System.err.println("Student Details :");
                System.out.println("Name : " + s1.name);
                System.out.println("Roll Number : " + s1.rollnumber);
                System.out.println("Grade : " + s1.grade);
                break;
            case 2:
                Student s2 = new Student("Kharaj Chakraborty", 1234567);
                System.err.println("Enter Student Details :");
                System.out.print("Grade : ");
                char g2 = sc.next().charAt(0);
                s2.setdata(g2);
                System.err.println("Student Details :");
                System.out.println("Name : " + s2.name);
                System.out.println("Roll Number : " + s2.rollnumber);
                System.out.println("Grade : " + s2.grade);
                break;
            case 3:
                Student s3 = new Student("Kharaj Chakraborty", 1234567, 'O');
                System.err.println("Student Details :");
                System.out.println("Name : " + s3.name);
                System.out.println("Roll Number : " + s3.rollnumber);
                System.out.println("Grade : " + s3.grade);
                break;

            default:
                throw new AssertionError();
        }

    }
}
