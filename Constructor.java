public class Constructor {

    public static void main(String[] args) {
        Circle1 obj = new Circle1(6.2);
        System.out.println("Area : "+obj.area());
    }
}
class Circle1{
    double radius;
      Circle1(double r){
        radius = r;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
