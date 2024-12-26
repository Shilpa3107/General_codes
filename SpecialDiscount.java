public class SpecialDiscount{
    public static void main(String args[]){
        int prices[] = {8,4,6,2,3};
        prices = specialDiscount(prices);
        for(int n : prices)
           System.out.print(n+" ");
    }
    public static int[] specialDiscount(int prices[]){
        for(int i = 0;i<prices.length-1;i++){
            for(int j = i+1;j<prices.length;j++){
                if(prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}