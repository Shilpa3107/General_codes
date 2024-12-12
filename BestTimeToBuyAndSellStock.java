public class BestTimeToBuyAndSellStock{
    public static void main(String args[]){
      int nums[] = {7,1,5,3,6,4};
      System.out.println(bestTimeToBuyAndSellStock(nums));
    }
    public static int bestTimeToBuyAndSellStock(int nums[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            min = Math.min(min,n);
            max = Math.max(max,n-min);
        }
        return max;
    }

}