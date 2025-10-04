import java.util.HashMap;
public class TwoSum5{
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        int result[] = twoSum5(nums,target);
        for(int n : result)
           System.out.print(n+" ");
    }
    public static int[] twoSum5(int nums[], int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int a = target-nums[i];
            if(map.containsKey(a))
              return new int[]{i,map.get(a)};
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}