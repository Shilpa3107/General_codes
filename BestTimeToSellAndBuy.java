class BestTimeToSellAndBuy {
    public static void main(String args[]){
        int prices[] = {7,1,2,4,2,5};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
      int min = prices[0];
      int max = 0;
        for(int n: prices){
            min = Math.min(min,n);
            max = Math.max(max,n-min);
        }
        return max;
    }
}