public class UglyNumber{
    public static void main(String args[]){
        int num = 97;
        if(check(num))
        System.out.println("It is a ugly number");
        else 
        System.out.println("It is not a ugly number");
    }
    public static boolean check(int n){
        if(n<=0)
        return false;
        int factor[] = {2,3,5};
        for(int num: factor){
            if(n%num == 0)
            n = n/num;
        }
        return n==1;
    }
}