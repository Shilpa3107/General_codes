class Tournament {
    public static void main(String args[]){
        int n = 7;
        System.out.println(numberOfMatches(n));
    }
    public static int numberOfMatches(int n) {
        int sum = 0;
        for(int i = 0;i<200;i++){
            if(n%2 == 0){
                sum = sum+(n/2);
                n = advance(n);                    
            }
            else{
                sum = sum+((n-1)/2);
                n = advance(n);
            }
        }
        return sum;
    }
    public static int advance(int a){
        if(a%2 == 0)
            return (int)(a/2);
        else
            return (int)((a-1)/2+1);
    }
}