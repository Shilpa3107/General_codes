import java.util.*;
class Duplicate {
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            set.add(i);
        }
        if(set.size() < nums.length)
            return true;
        else 
            return false;
    }
}