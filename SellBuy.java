class SellBuy {
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int p: prices){
            min = Math.min(min,p);
            max = Math.max(max,p-min);
        }
        return max;
    }
}