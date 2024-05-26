public class InvokConst {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Dog3 obj = new Dog3();
    }
}
class Animal3{
    Animal3(){
        System.out.println("Animal Constructor");
    }
}
class Dog3 extends Animal3{
    Dog3(){
        System.out.println("Dog Constructor");
    }
}
