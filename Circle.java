class Circle{
    public int radius;
    Circle(int r){
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder extends Circle{
    public int height;

        Cylinder(int r, int h){
            super(r);
            this.height = h;
        }

    public double volum(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class ch10practiceset {
    public static void main(String[] args) {
        // problem 1
        Circle obj = new Circle(12);
        Cylinder obj1 = new Cylinder(23,34);
        obj.area();
        System.out.println(obj);
    }
}

