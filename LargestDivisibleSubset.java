import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class LargestDivisibleSubset{
    public static void main(String args[]){
        int nums[] = {1,2,3};
        List<Integer> list = largestDivisibleSubset(nums);
        for(int n : list)
          System.out.print(n+" ");
    }
    public static List<Integer> largestDivisibleSubset(int nums[]){
        if(nums.length == 0)
        return new ArrayList<>();
        Arrays.sort(nums);
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        int maxSize = 1, maxInd = 0;
        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]%nums[j]==0)
                  dp[i] = Math.max(dp[i],dp[j]+1);
                  if(dp[i] > maxSize){
                    maxSize = dp[i];
                    maxInd = i;
                  }
            }
        }
        List<Integer> list = new ArrayList<>();
        int num = nums[maxInd];
        for(int i = maxInd;i>=0;i--){
            if(num%nums[i] == 0 && dp[i] == maxSize){
                list.add(nums[i]);
                num = nums[i];
                maxSize--;
            }
        }
        return list;
    }
}