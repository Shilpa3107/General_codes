public class BestTimeBuySell{
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        System.out.println(bestTimeBuySell(price));
    }
    public static int bestTimeBuySell(int price[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : price){
            min = Math.min(min, n);
            max = Math.max(max,n-min);
        }
        return max;
    }
}