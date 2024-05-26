class Shapes3{
    public static void main(String args[]){

        Circle8 obj = new Circle8(8.7);
        obj.area();
        obj.perimeter();
    }
}
abstract class Shape6{
    abstract public void area();
    abstract public void perimeter();
}
class Circle8 extends Shape6{
    double radius;
    Circle8(double radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println("Area : "+(3.14*radius*radius));
    }
    public void perimeter(){
        System.out.println("Perimeter : "+(2*3.14*radius));
    }
}