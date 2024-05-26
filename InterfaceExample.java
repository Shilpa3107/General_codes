class InterfaceExample{
    public static void main(String args[]){

        Rectangle obj = new Rectangle(7,9);
        obj.getSides(4);
        obj.getArea();
    }
}
interface Polygon{
    void getSides(int a);
    void getArea();
}
class Rectangle implements Polygon{
    double length,breadth;
    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    public void getSides(int side){
        System.out.println("Number of sides : "+side);
    }
    public void getArea(){
        System.out.println("Area : "+(length*breadth));
    }
}