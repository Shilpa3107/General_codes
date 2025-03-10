public class ClimibingStairs{
    public static void main(String args[]){
       int n = 3;
       System.out.println(climingStairs(n));
    }
    public static int climingStairs(int n){
        if(n == 1)
          return 1;
        if(n == 2)
          return 2;
        int f = 1, s = 2, t = 0;
        n = n-2;
        while(n-->0){
            t = f+s;
            f = s;
            s = t;
        }
        return t;
    }
}