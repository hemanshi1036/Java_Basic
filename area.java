import java.util.Scanner;
// calculate area of the circle.
class AreaCalculate{

    public double area(double side){
        return side * side;
    }
    public double area(double length, double width){
        return length * width;
    }
    public double area(double height, int base){
        return 0.5 * height * base;
    }
}
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculate calculate = new AreaCalculate();
        double area = 0.0;
        System.out.println("Enter The Shape what you find the Area : Square, Rectangle, Triangle " );
        String Shape = sc.nextLine();
        if(Shape.equalsIgnoreCase("Square")){
            System.out.println("Enter the side of square : ");
            double side = sc.nextDouble();
            area = calculate.area(side);
        }
        else if(Shape.equalsIgnoreCase("Rectangle")){
            System.out.println("Enter the length of Rectangle : ");
            double length = sc.nextDouble();
            System.out.println("Enter the width of Rectangle : ");
            double width = sc.nextDouble();

            area = calculate.area(length, width);
        }
        else if(Shape.equalsIgnoreCase("Triangle")){
            System.out.println("Enter the base of Triangle : ");
            double base = sc.nextDouble();
            System.out.println("Enter the height of Triangle : ");
            double height = sc.nextDouble();

            area = calculate.area(base, height);
        }
        else {
            System.out.println("This is not a mentioned Shape.");
        }
        System.out.println("The area of " + Shape + " is : " +area);
    }
}
