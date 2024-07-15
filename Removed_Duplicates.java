import java.util.*;
class Removed_Duplicates {
    public static void main(String args[]){
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k = set.size();
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        int array[] = new int[set.size()];
        for(int i = 0;i<list.size();i++){
            array[i] = list.get(i);
        }
        Arrays.sort(array);
       // for(int i = 0;i<Math.min(nums.length,a))
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<list.size();i++){
            map.put(list.get(i),count(nums,list.get(i)));
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i<list.size();i++){
            arr.add(array[i]);
        }
        for(Map.Entry<Integer,Integer> mapEle: map.entrySet()){
            if(mapEle.getValue() >= 2){
                arr.add(mapEle.getKey());
            }
        }
       for(int i = 0;i<Math.min(nums.length,arr.size());i++){
           nums[i] = arr.get(i);
       }
        return k;
    }
    public static int firstocuurence(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res =mid;
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else 
                end = mid-1;
        }
        return res;
    }
    public static int lastocuurence(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res =mid;
                start = mid+1;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else 
                end = mid-1;
        }
        return res;
    }
    public static int count(int nums[], int target){
        return lastocuurence(nums,target)-firstocuurence(nums,target)+1;
    }
}