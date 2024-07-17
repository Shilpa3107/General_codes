import java.util.*;
class ThreeSum {
    public static void main(String args[]){
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        
        Arrays.sort(nums);
        
        List<List<Integer>> listoflist = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int fixed = 0;fixed<nums.length;fixed++){
            int left = fixed+1;
            int right = nums.length-1;
            while(left<right){
            sum = nums[fixed]+nums[left]+nums[right];
            if(sum == 0){
                set.add(Arrays.asList(nums[fixed],nums[left],nums[right]));
                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }
            else if(sum>0){
                right--;
            }
        }
        }
        listoflist.addAll(set);
        return listoflist;
    }
}