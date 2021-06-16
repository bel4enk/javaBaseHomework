package shapes.itea;


public class Rectangle extends Shape {

    double side1;
    double side2;

    public Rectangle(double square, double perimetr, String name, double side1, double side2) {
        super(square, perimetr, name);
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle(Shape ob, double side1, double side2) {
        super(ob);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public static double perim (double side1, double side2){
        double perim = 2*(side1+side2);
        return perim;
    }
}
