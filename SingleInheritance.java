public class SingleInheritance {
public static void main(String[] args) {
    Dog obj1 = new Dog();
    obj1.activity();
    obj1.printData();
}
}
class Animal{
    public void activity(){
        System.out.println("Walking....");
    }
}
class Dog extends Animal{
    public void printData(){
        System.out.println("Barking...");
    }
}