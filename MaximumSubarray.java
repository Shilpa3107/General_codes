import java.util.HashSet;
public class MaximumSubarray{
    public static void main(String args[]){
       int arr[] = {1,1,1,7,8,9};
       int k = 3;
       System.out.println(maximumSubarray(arr,k));
    }
    public static long maximumSubarray(int nums[], int k){
        HashSet<Integer> set = new HashSet<>();
        long max = 0;
        long sum = 0;
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            while(set.contains(nums[i]) || set.size() >= k){
                set.remove(nums[j]);
                j++;
            }
            set.add(nums[i]);
            sum += nums[i];
            if(set.size() == k)
             max = Math.max(max,sum);
        }
        return max;
    }
}