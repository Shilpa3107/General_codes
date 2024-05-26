public class CallByReference {

    int num = 5;
    public static void main(String args[]){

        CallByReference obj = new CallByReference();
        System.out.println("Before incrementing in main method : "+obj.num);
        incre(obj);
        System.out.println("After incrementing in main method : "+obj.num);

    }
    public static void incre(CallByReference obj){
        System.out.println("Before incrementing in method : "+obj.num);
        obj.num += 1;
        System.out.println("After incrementing in method : "+obj.num);
    }
}
