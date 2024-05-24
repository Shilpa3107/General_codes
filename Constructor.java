public class Constructor {

    public static void main(String[] args) {
        Circle obj = new Circle(6.2);
        System.out.println("Area : "+obj.area());
    }
}
class Circle{
    double radius;
      Circle(double r){
        radius = r;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
