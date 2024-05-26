public class InvokMethod {

    public static void main(String[] args) {
        Dog2 obj = new Dog2();
        obj.display();
    }
}
class Animal2{

   void printData(){
        System.out.println("Eating...");
    }
}
class Dog2 extends Animal2{
    void printData(){
        System.out.println("Eating Bread...");
    }
    void display(){
      printData();
     super.printData();
    }

}
