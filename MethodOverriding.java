public class MethodOverriding {
public static void main(String[] args) {
    Dog6 obj = new Dog6();
    obj.printData();
}

}
class Animal6{
    public void printData(){
        System.out.println("Walking");
    }
}
class Dog6 extends Animal6{
    @Override
    public void printData(){
        System.out.println("Barking");
    }
}
