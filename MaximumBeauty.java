import java.util.Arrays;
public class MaximumBeauty{
    public static void main(String args[]){
        int nums[] = {4,6,1,2};
        int k = 2;
        System.out.println(maximumBeauty(nums,k));
    }
    public static int maximumBeauty(int nums[], int k){
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            int upper = BinarySearch(nums, nums[i]+2*k);
            count = Math.max(count,upper-i+1);
        }
        return count;
    }
    public static int BinarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] <= target){
                res = mid;
                start = mid+1;
            }
            else 
              end = mid-1;
        }
        return res;
    }
}