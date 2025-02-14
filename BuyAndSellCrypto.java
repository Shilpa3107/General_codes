public class BuyAndSellCrypto{
    public static void main(String args[]){
       int prices[] = {7,1,5,3,6,4};
       System.out.println(buyAndSellCrypto(prices));
    }
    public static int buyAndSellCrypto(int prices[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : prices){
            min = Math.min(n,min);
            max = Math.max(max,n-min);
        }
        return max;
    }
}