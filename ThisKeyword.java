public class ThisKeyword {

    public static void main(String[] args) {
        Circle2 obj = new Circle2(9.8);
        System.out.println("Area: "+obj.area());
    }
}
class Circle2{
    double radius;
    Circle2(double radius){
        this.radius = radius;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
