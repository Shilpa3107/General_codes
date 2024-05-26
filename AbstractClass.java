public class AbstractClass {

    public static void main(String[] args) {
        Dog5 obj = new Dog5();
        obj.Data();
        obj.data();
    }
}
abstract class Animal5{

    abstract void Data();
    void data(){
        System.out.println("Eating Bread");
    }
}
class Dog5 extends Animal5{
    @Override
    void Data(){
        System.out.println("Eating");
    }
}
