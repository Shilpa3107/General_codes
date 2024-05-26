public class CallByValue {

    public static void main(String args[]){

        int num = 5;
        System.out.println("Before incrementing in main method : "+num);
        incre(num);
        System.out.println("After incrementing in main method : "+num);
    }
    public static void incre(int num){
        System.out.println("Before incrementing in method : "+num);
        num = num+1;
        System.out.println("After incrementing in method : "+num);
    }
}
