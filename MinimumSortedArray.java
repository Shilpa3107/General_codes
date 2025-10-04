public class MinimumSortedArray{
    public static void main(String args[]){
        int nums[] = {4,7,8,9,0,2,3};
        System.out.println(minimumSortedArray(nums));
    }
    public static int minimumSortedArray(int nums[]){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start+(end-start)/2;
            if(nums[mid] > end)
              start = mid+1;
            else 
              end = mid;
        }
        return nums[start];
    }
}