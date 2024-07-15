import java.util.*;
class Duplicate_Number {
    public static void main(String args[]){
        int nums[] = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        set.clear();
        for(int i = 0;i<list.size();i++){
            map.put(list.get(i),count(nums,list.get(i)));
        }
        int n = 0;
        for(Map.Entry<Integer,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue() > 1)
                n = mapEle.getKey();
        }
        return n;
    }
        // public int frequency(int nums[], int target){
        //     int count = 0;
        //     for(int i = 0;i<nums.length;i++){
        //         if(target == nums[i]){
        //             count++;
        //             nums[i] = -1;
        //         }
        //     }
        //     return count;
        // }
    public static int firstoccurence(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res = mid;
                end = mid-1;
            }
            else if(nums[mid]<target)
                start = mid+1;
            else 
                end = mid-1;
        }
        return res;
    }
     public static int lastoccurence(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res = mid;
                start = mid+1;
            }
            else if(nums[mid]<target)
                start = mid+1;
            else 
                end = mid-1;
        }
        return res;
    }
    public static int count(int nums[], int target){
        return lastoccurence(nums,target)-firstoccurence(nums,target)+1;
    }
}
