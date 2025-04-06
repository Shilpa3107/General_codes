import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class LargestDivisbleSubset{
    public static void main(String args[]){
        int nums[] = {1,2,3};
        List<Integer> result = largestDivisbleSubset(nums);
        System.out.println(result);
    }
    public static List<Integer> largestDivisbleSubset(int nums[]){
        Arrays.sort(nums);
        int dp[] = new int[nums.length];
        int prev[] = new int[nums.length];
        int maxInd = 0;
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]%nums[j] == 0 && dp[j]+1 > dp[i]){
                    dp[i] = dp[j]+1;
                    prev[i] = j;
                }
            }
            if(dp[i] > dp[maxInd])
              maxInd = i;
        }
        List<Integer> result = new ArrayList<>();
        while(maxInd != -1){
            result.add(nums[maxInd]);
            maxInd = prev[maxInd];
        }
        return result;
    }
}