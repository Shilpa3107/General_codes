import java.util.*;

class Duplicates {
    public static void main(String args[]){
        int nums[]={4,3,2,7,8,3,2,1};
        List<Integer> list = findDuplicates(nums);
        System.out.println(list);
    }
    public static List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<>(set);
        for(int i = 0;i<list.size();i++){
            map.put(list.get(i),count(nums,list.get(i)));
        }
        list.clear();
        set.clear();
        for(Map.Entry<Integer,Integer> mapEle : map.entrySet()){
            if(mapEle.getValue()==2)
                list.add(mapEle.getKey());
        }
        return list;
    }
    public static int firstOccurence(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        int res= - 1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res = mid;
                end= mid-1;
            }
            else if(nums[mid]<target)
                start = mid+1;
            else 
                end = mid-1;
        }
        return res;
    }
    public static int lastOccurence(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        int res= - 1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                res = mid;
                start= mid+1;
            }
            else if(nums[mid]<target)
                start = mid+1;
            else 
                end = mid-1;
        }
        return res;
    }
    public static int count(int nums[], int target){
        return lastOccurence(nums,target)-firstOccurence(nums,target)+1;
    }
}