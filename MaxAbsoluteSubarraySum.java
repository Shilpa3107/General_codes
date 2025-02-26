public class MaxAbsoluteSubarraySum{
    public static void main(String args[]){

        int nums[] = {1,-3,2,3,-4};
        System.out.println(maxAbsoluteSubarraySum(nums));
    }
    public static int maxAbsoluteSubarraySum(int nums[]){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, prefixSum = 0, maxAbsSum = 0;
        for(int n : nums){
            prefixSum += n;
            min = Math.min(min, prefixSum);
            max = Math.max(max,prefixSum);
            if(prefixSum >= 0)
              maxAbsSum = Math.max(maxAbsSum,prefixSum-min);
            else if(prefixSum < 0)
               maxAbsSum = Math.max(maxAbsSum,Math.max(Math.abs(prefixSum),Math.abs(prefixSum-max)));
        }
        return maxAbsSum;
    }
}