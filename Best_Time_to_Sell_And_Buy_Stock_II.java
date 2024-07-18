class Best_Time_to_Sell_And_Buy_Stock_II {
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int start = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(start<prices[i])
            {
                max = max+(prices[i]-start);
            }
            start = prices[i];
        }
        return max;
    }
}