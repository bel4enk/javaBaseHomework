package shapes.itea;

public class Shape {
    double square;
    double perimetr;
    String name;

    public Shape() {

    }

    public Shape(double square, double perimetr, String name) {
        square = square;
        perimetr = perimetr;
        name = name;
    }

    public Shape(Shape ob) {
        square = ob.square;
        perimetr = ob.perimetr;
        name = ob.name;

    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shapeName(String name){
        System.out.println("The name of figure" + name);
    }


}
