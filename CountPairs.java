import java.util.ArrayList;
import java.util.List;
class CountPairs {
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
       int target= 2;
       System.out.println(countPairs(nums,target));
    }
    public static int countPairs(List<Integer> nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<nums.size();i++){
            sum(nums,list,nums.get(i),i);
        }
        int counts = count(list,target);
        return counts;
        
    }
    public static void sum(List<Integer> nums, List<Integer> arr, int n, int ind){
        for(int i = 0;i<nums.size();i++){
            if(ind < i){
                arr.add(nums.get(i)+n);
            }
        }
    }
    public static int count(List<Integer> arr, int target){
        int count = 0;
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i) < target)
                count++;
        }
        return count;
    }
}