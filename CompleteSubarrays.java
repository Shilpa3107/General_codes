import java.util.HashSet;
public class CompleteSubarrays{
    public static void main(String args[]){
         int nums[] = {1,3,1,2,2};
         System.out.println(completeSubarrays(nums));
    }
    public static int completeSubarrays(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums)
           set.add(n);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            HashSet<Integer> seen = new HashSet<>();
            for(int j = i;j<nums.length;j++){
                seen.add(nums[j]);
                if(seen.size()==set.size())
                count++;
            }
        }
        return count;
    }
}