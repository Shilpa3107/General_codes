class Best_Time_To_Buy_Stock {
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
       int min = Integer.MAX_VALUE;
       int max = 0;
        for(int k: prices){
            min = Math.min(min,k);
            max = Math.max(max,k-min);
        }
        return max;
    }
}