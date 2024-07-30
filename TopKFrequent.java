import java.util.*;
class TopKFrequent {
    public static void main(String args[]){
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        int arr[] = topKFrequent(nums,k);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
       Arrays.sort(nums);
    HashSet<Integer> set = new HashSet<Integer>();
    for(int n: nums){
        set.add(n);
    }
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>(set);
         ArrayList<Integer> list1 = new ArrayList<Integer>();
    for(int i = 0;i<set.size();i++){
       map.put(list.get(i),count(nums,list.get(i)));
        list1.add(count(nums,list.get(i)));
    }
        Collections.sort(list1, Collections.reverseOrder()); 
        int arr[] = new int[k];
        for(int i = 0;i<k;i++){
            arr[i] = check(map,list1.get(i));
        }
        
   
        
  //System.out.println(map+" "+list1);
        return arr;
    }
    public static int check(HashMap<Integer,Integer> map, int n){
        int index = -1;
        for(Map.Entry<Integer,Integer> mapEle: map.entrySet()){
            if(mapEle.getValue() ==  n){
                index = mapEle.getKey();
            }
        }
        if(index!=-1)
            map.remove(index);
        return index;
    }
    public static  int firstoccurence(int nums[], int target){
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
    public static  int lastoccurence(int nums[], int target){
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
    public static  int count(int nums[], int target){
        return lastoccurence(nums, target)-firstoccurence(nums,target)+1;
    }
}