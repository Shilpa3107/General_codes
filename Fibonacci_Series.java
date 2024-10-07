class Fibonacci_Series {
    public static void main(String args[]){
        System.out.println(fib(7));
    }
    public static int fib(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        int f = 0;
        int s = 1;
        int t = 0;
       for(int i = 2;i<=n;i++){
            t = f+s;
            f = s;
            s = t;
        }
        return t;
    }
}