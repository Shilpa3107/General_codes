public class MaximumAscendingSubarraySum{
    public static void main(String args[]){
        int nums[] = {10,20,30,5,10,50};
        System.out.println(maximumAscendingSubarraySum(nums));

    }public static int maximumAscendingSubarraySum(int nums[]){
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            sum += nums[i];
            for(int j = i+1;j<nums.length;j++){
                if(nums[j-1] < nums[j])
                  sum += nums[i];
                else 
                  break;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}