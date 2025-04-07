public class EqualSubsetSum{
    public static void main(String args[]){
        int nums[] = {1,5,11,5};
        System.out.println(equalSubsetSum(nums));
    }
    public static boolean equalSubsetSum(int nums[]){
        int sum = 0;
        for(int n : nums)
          sum += n;
        if(sum%2 != 0)
          return false;
        int targetSum = sum/2;
        boolean dp[] = new boolean[targetSum+1];
        dp[0] = true;
        for(int n : nums){
            for(int curr = targetSum;curr>=n;curr--){
                dp[curr] = dp[curr]||dp[curr-n];
                if(dp[targetSum])
                  return true;
            }
        }
        return dp[targetSum];
    }
}