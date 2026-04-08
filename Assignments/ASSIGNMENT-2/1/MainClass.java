
// 1. WAP In Java to create a class named Rectangles with 2 data members - length and width (both of type float), Include methods to calculate the area and perimeter of the rectangle, Create two Rectangle Objects in main method set their attributes and print the area and perimeter

class Rectangle {

    public float length;
    public float width;
    public float area;
    public float perimeter;

    public Rectangle() {
    }

    Rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    public float Area() {
        area = (length * width);
        return area;
    }

    public float Perimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }

}

public class MainClass {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(7.0f, 7.0f);
        Rectangle r2 = new Rectangle(5.0f, 5.0f);

        System.out.println("r1 : Perimeter : " + r1.Perimeter());
        System.out.println("r1 : Area : " + r1.Area());

        System.out.println("r2 : Perimeter : " + r2.Perimeter());
        System.out.println("r2 : Area : " + r2.Area());

    }
}