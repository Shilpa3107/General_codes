public class RichestPile{
    public static void main(String args[]){
        int gifts[] = {25,64,9,4,100};
        int k = 4;
        while(k-->0){
            gifts = getReplace(getMax(gifts),getRoot(getMax(gifts)),gifts);
        }
        long sum = 0;
        for(int n : gifts)
          sum = sum+(long)n;
        System.out.println("Gifts from the Richest Pile : "+sum);
    }
    public static int getMax(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int n : nums)
          max = Math.max(max,n);
        return max;
    }
    public static int getRoot(int n){
        return (int)Math.sqrt(n);
    }
    public static int[] getReplace(int max, int n, int nums[]){
        for(int i = 0;i<nums.length;i++){
            if(max == nums[i]){
                nums[i] = n;
                break;
            }
        }
        return nums;
    }
}