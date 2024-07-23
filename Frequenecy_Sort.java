import java.util.HashMap;
import java.util.Arrays;
class Frequenecy_Sort {
    public static void main(String args[]){
        int nums[] = {1,1,2,2,2,3};
        nums = frequencySort(nums);
        for(int n:nums)
        System.out.print(n+" ");
    }
    public static int[] frequencySort(int[] nums) {
        
        //for matching number with its frequency
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        Integer numsObj[] = new Integer[nums.length];
        for(int i = 0;i<nums.length;i++){
            numsObj[i] = nums[i];
        }
        //using lambda function to sort the it based on frequenecy and then based on values
        Arrays.sort(numsObj,(a,b)->{
            if(map.get(a).equals(map.get(b)))
                return Integer.compare(b,a);
            return Integer.compare(map.get(a),map.get(b));
        });
        for(int i = 0;i<nums.length;i++){
            nums[i] = numsObj[i];
        }
        return nums;
    }
}