public class Minimum_Subarray_Sum{
    public static void main(String args[]){
        int arr[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minimum_subarray(arr, target));
    }
    public static int minimum_subarray(int nums[], int target){
        int left = 0;
        int currentSum = 0;
        int res = Integer.MAX_VALUE;
        for(int right = 0;right < nums.length;right++){
            currentSum += nums[right];
            while(currentSum >= target){
                res = Math.min(res, right-left+1);
                currentSum -= nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE?0:res;
    }
}