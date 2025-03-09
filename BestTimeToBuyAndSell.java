public class BestTimeToBuyAndSell{
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(bestTimeToBuyAndSell(prices));
    }
    public static int bestTimeToBuyAndSell(int prices[]){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int n : prices){
            min = Math.min(min,n);
            max = Math.max(max,n-min);
        }
        return max;
    }
}