public class MinimumInSortedArray{
    public static void main(String args[]){
        int nums[] = {4,5,1,2,3};
        System.out.println(min(nums));
    }
    public static int min(int nums[]){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int  mid = start+(end-start)/2;
            if(nums[mid] > nums[end])
            start = mid+1;
            else 
            end = mid;
        }
        return nums[start];
    }
}