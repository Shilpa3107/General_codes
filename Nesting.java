class Nesting{
    public static void main(String args[]){
        Test.nestedInter obj;
        Testing t = new Testing();
        obj = t;
        obj.show();
    }
}
class Test{
    public interface nestedInter{
        void show();
    }
}
class Testing implements Test.nestedInter{

    public void show(){
        System.out.println("It is showing nested interface");
    }
}
