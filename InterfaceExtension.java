class InterfaceExtension{
    public static void main(String args[]){

        Test1 obj = new Test1();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
interface A{
    void meth1();
    void meth2();
}
interface B extends A{
    void meth3();
}
class Test1 implements B{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
}