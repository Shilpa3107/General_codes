import java.util.*;

class Majority_Element {
    public static void main(String args[]){
        int nums[]={3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            set.add(i);
        }
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<list.size();i++){
            map.put(list.get(i),count(nums,list.get(i)));
        }
        int n = 0;
        for(Map.Entry<Integer,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue()>nums.length/2)
                n = mapEle.getKey();
        }
        return n;
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