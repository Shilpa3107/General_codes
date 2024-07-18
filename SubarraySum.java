import java.util.*;
class SubarraySum{
    public static void main(String args[]){
        int nums[] = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums,k));
    }
    public static int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int n: nums){
            sum = sum+n;
            if(map.containsKey(sum-k))
               count = count+map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}