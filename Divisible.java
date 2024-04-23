class Divisible {
    public static void main(String args[]){
        int n = 10;
        int m = 3;
        System.out.println(differenceOfSums(n,m));
    }
    public static int differenceOfSums(int n, int m) {
       int num1 = 0, num2 = 0;
        for(int i =1;i<=n;i++){
            if(i%m == 0)
                num2 = num2+i;
            else
                num1 = num1+i;
        }
        return num1-num2;
    }
}