import java.util.Scanner;
class Shape {
    // it is a base clss protected perametres
    protected double width;
    protected double height;
    public void getData() {
        Scanner scanner = new Scanner(System.in);
System.out.println("Enter Values :");
System.out.print("Width : ");
        width = scanner.nextDouble();
System.out.print("Height : ");
        height = scanner.nextDouble();
    }
}
class Triangle extends Shape {
    public void displayArea() {
        double area = 0.5 * width * height;
System.out.println("Area of Triangle: " + area);
    }
}
class Rectangle extends Shape {
    public void displayArea() {
        double area = width * height;
System.out.println("Area of Rectangle: " + area);
    }
}

//main class would be run
public class Base_Shape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
System.out.println("Enter Triangle dimensions:");
triangle.getData();
triangle.displayArea();
System.out.println("\nEnter Rectangle dimensions:");
rectangle.getData();
rectangle.displayArea();
    }
}
