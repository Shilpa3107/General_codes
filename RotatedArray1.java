public class RotatedArray1 {
public static void main(String args[]){
    int nums[] = {4,5,6,7,0,1,2};
    int target = 0;
    System.out.println(search(nums,target));
}
 public static int search(int[] nums, int target) {
     int a = binarySearch(nums,target, 0,(minimum(nums)+nums.length-1)%nums.length);
     int b = binarySearch(nums,target,minimum(nums),nums.length-1);
        if(a != -1)
            return a;
        else if( b!= -1)
            return b;
        else 
            return -1;
    }
    public static int minimum(int nums[]){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[end])
                start = mid+1;
            else 
                end = mid;
        }
        return start;
    }
    public static int binarySearch(int nums[], int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid-1;
            else 
                start = mid+1;
        }
        return -1;
    }
}