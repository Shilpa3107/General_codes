public class GeoAnalyzer {
    public static void main(String[] args) {
        Circle3 obj = new Circle3();
        obj.area(6.4);
        obj.perimeter(9.6);
        obj.display();
    }
}
interface GeoAnalyzer1 {
    static final double pi = 3.14;
    void area(double r);
    void perimeter(double r);
}

class Circle3 implements GeoAnalyzer1 {
    double area, perimeter;

    // Default constructor
    public Circle3() {
    }

    @Override
    public void area(double radius) {
        area = pi * radius * radius;
    }

    @Override
    public void perimeter(double r) {
        perimeter = 2 * pi * r;
    }

    public void display() {
        System.out.println("Area : " + area + " Perimeter : " + perimeter);
    }
}
