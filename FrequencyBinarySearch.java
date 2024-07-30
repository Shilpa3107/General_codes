import java.util.*;
public class FrequencyBinarySearch{
    public static void main(String args[]){
    int nums[] = {1,1,1,2,2,3,3};
    Arrays.sort(nums);
    HashSet<Integer> set = new HashSet<Integer>();
    for(int n: nums){
        set.add(n);
    }
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>(set);
    for(int i = 0;i<set.size();i++){
       map.put(list.get(i),count(nums,list.get(i)));
    }
    System.out.println(map);
    }
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
            else if(nums[mid] < target){
                start = mid+1;
            }
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
            else if(nums[mid] < target){
                start = mid+1;
            }
            else 
            end = mid-1;
        }
        return res;
    }
    public static int count(int nums[], int target){
        return lastoccurence(nums, target)-firstoccurence(nums,target)+1;
    }
}