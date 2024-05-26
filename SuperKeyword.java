public class SuperKeyword {
public static void main(String[] args) {
    Dog1 obj = new Dog1();
    obj.printData();
}
}
class Animal1{
    String color = "blue";
}
class Dog1 extends Animal1{
    String color = "black";
    public void printData(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
