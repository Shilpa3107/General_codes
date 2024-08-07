class HappyNumber {
    public static void main(string args[]){
        System.out.println(isHappy(678));
    }
    public static boolean isHappy(int n) {
        
        long k = n;
        while(k > 9){
            k = check(k);
        }
        if(k==1 || k == 7)
            return true;
        else 
            return false;
        
    }
    public static long check(long num){
        long sum = 0;
        while(num > 0){
            long dig = num%10;
            sum = sum+dig*dig;
            num = num/10;
        }
        return sum;
    }
}