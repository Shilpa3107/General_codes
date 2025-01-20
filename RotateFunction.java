 public class RotateFunction{
    public static void main(String args[]){
        int nums[] = { 4,3,2,6};
        System.out.println(rotateFunction(nums));
    }
    public static int rotateFunction(int nums[]){
        int sum = 0, f = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            f += i*nums[i];
        }
        int dp[] = new int[nums.length];
        dp[0] = f;
        max = dp[0];
        for(int i = 1;i<nums.length;i++){
           dp[i] = dp[i-1]+sum-nums.length*nums[nums.length-i];
           max = Math.max(max,dp[i]);
        }
        return max;
    }
 }