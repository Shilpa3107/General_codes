import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class InterestingSubarrays{
    public static void main(String args[]){
       List<Integer> nums = new ArrayList<>();
       int modulo = 2;
       int k = 1;
       nums.add(3);
       nums.add(2);
       nums.add(4);
       System.out.println(interestingSubarrays(nums,modulo,k));
    }
    public static long interestingSubarrays(List<Integer> nums, int modulo, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        long result = 0;
        map.put(0,1);
        for(int n : nums){
            prefix += n%modulo == k ? 1:0;
            result += map.getOrDefault((prefix-modulo+k)%modulo,0);
            map.put(prefix%modulo,map.getOrDefault(prefix%modulo,0)+1);
        }
        return result;
    }
}