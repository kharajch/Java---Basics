import java.util.Scanner;

// 3.WAP in Java to create a class named Student with attributes name (str), rollnumber (Short) and grade (char). Implement Multiple Constructor : a default constructor, a constructor that takes name and roll number, a constructor that takes all three values, create different shortcut objects using different constructor and point their details.

class Student {
    String name;
    short rollnumber;
    char grade;

    public Student() {
        this.name = "";
        this.rollnumber = 0;
        this.grade = 'U';
    }

    public Student(String name, short rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = 'U';
    }

    public Student(String name, short rollnumber, char grade) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
    }

    public void setdata(String name, short rollnumber, char grade) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
    }

    public void setdata(char grade) {
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Student Details :");
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollnumber);
        System.out.println("Grade : " + this.grade);
    }
}

public class MainClass {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf(
                "1. Using Default Constructor.\n2. Using Constructor With Name And Roll No.\n3. Using Constructor With Name, Roll Number And Grade.\nEnter Option : ");

        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                Student s1 = new Student();
                System.out.println("Enter Student Details :");
                System.out.print("Name : ");
                String n1 = sc.nextLine();
                System.out.print("Roll Number : ");
                short r1 = sc.nextShort();
                sc.nextLine();
                System.out.print("Grade : ");
                char g1 = sc.nextLine().charAt(0);
                s1.setdata(n1, r1, g1);
                s1.displayDetails();
                break;
            case 2:
                Student s2 = new Student("Kharaj Chakraborty", (short) 1234);
                System.out.print("Enter Grade : ");
                char g2 = sc.nextLine().charAt(0);
                s2.setdata(g2);
                s2.displayDetails();
                break;
            case 3:
                Student s3 = new Student("Kharaj Chakraborty", (short) 1234, 'O');
                s3.displayDetails();
                break;
            default:
                System.out.println("Invalid option. Please select 1, 2 or 3.");
                break;
        }

        sc.close();
    }
}
