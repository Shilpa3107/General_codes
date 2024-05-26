class AbstractionExample{
    public static void main(String args[]){

        SubClass1 obj = new SubClass1();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
abstract class SuperClass1{

    public void meth1(){
        System.out.println("It is method1");
    }
    public void meth2(){
        System.out.println("It is method2");
    }
    abstract public void meth3();
}
class SubClass1 extends SuperClass1{
    @Override 
    public void meth3(){
        System.out.println("It is method 3");
    }
}