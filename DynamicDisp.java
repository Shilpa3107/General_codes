public class DynamicDisp {
    public static void main(String[] args) {
        Dog4 obj = new Dog4();
        obj.printData();
        Animal4 obj1 = new Animal4();
        obj1.printData();
        Animal4 obj2 = new Dog4();
        obj2.printData();
    }

}
class Animal4{
    void printData(){
        System.out.println("Eating");
    }
}
class Dog4 extends Animal4{

    void printData(){
        System.out.println("Eating Bread");
    }
}
