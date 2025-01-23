public class BestTimeToBuySellStock{
    public static void main(String args[]){
       int prices[] = {7,1,5,3,6,4};
       System.out.println(bestTimeToBuySellStock(prices));
    }
    public static int bestTimeToBuySellStock(int prices[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : prices){
            min = Math.min(min,n);
            max = Math.max(max,n-min);
        }
        return max;
    }
}