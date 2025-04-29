import java.util.Arrays;
public class CountSubarrayMax{
    public static void main(String args[]){
        System.out.println(countSubarrayMax(new int[]{1,3,2,3,3},2));
    }
    public static long countSubarrayMax(int nums[], int k){
        int maxElement = Arrays.stream(nums).max().getAsInt();
        long start = 0, ans = 0;
        int maxWindow = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == maxElement)
              maxWindow++;
            while(maxWindow == k){
                if(nums[(int)start] == maxElement)
                  maxWindow--;
                start++;
            }
            ans += start;
        }
        return ans;
    }
}