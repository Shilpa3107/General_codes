public class Circle{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.radius = 8;
        System.out.println("Circle");
        System.out.println("Circumfernece : "+obj.circumference());
        System.out.println("Area : "+obj.area());
        Demo1 obj1 = new Demo1();
        obj1.height = 3;
        obj1.width = 2;
        obj1.depth = 7;
        System.out.println("Cuboid");
        System.out.println("Volume : "+obj1.volume());
        System.out.println("Area : "+obj1.area());
        Demo2 obj2 = new Demo2();
        System.out.println("Triangle");
        System.out.println("Area : "+obj2.area(4,6));
    }
}
class Demo {

    double radius;
    double circumference(){
        return 2*3.14*radius;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
class Demo1 {
    double width,height,depth;
    double area(){

        return (width*height+height*depth+depth*width)*2;
    }
    double volume(){
        return height*depth*width;
    }
}
class Demo2 {
    double area(double height,double base){
        return (base*height)/2;
    }
}