public class SumIsThree{
    public static void main(String args[]){
        int n = 12;
        System.out.println(sumIsThree(n));
    }
    public static boolean sumIsThree(int n){
         return powers(0,n);
    }
    public static boolean powers(int power, int n){
        if(n == 0)
         return true;
        if(Math.pow(3,power) > n)
         return false;
        boolean takePower = powers(power+1,n-(int)Math.pow(3,power));
        boolean skipPower = powers(power+1,n);
        return takePower||skipPower;
    }
}