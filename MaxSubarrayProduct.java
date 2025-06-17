public class MaxSubarrayProduct{
    public static void main(String args[]){
            int nums[] = {2,3,-2,4};
            System.out.println(maxSubarrayProduct(nums));
    }
    public static int maxSubarrayProduct(int nums[]){
        int curr = 1, max = Integer.MIN_VALUE;
        for(int n : nums){
            curr *=n;
            if(curr>max)
               max = curr;
            if(curr < 0)
              curr = 1;
        }
        return max;
    }
}