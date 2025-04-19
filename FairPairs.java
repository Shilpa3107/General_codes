import java.util.Arrays;
public class FairPairs{
    public static void main(String args[]){
          int nums[] = {0,1,7,4,4,5};
          int lower = 3;
          int upper = 6;
          System.out.println(countFairPairs(nums,lower,upper));
    }
    public static long countFairPairs(int nums[],int lower,int upper){
          long count = 0;
          Arrays.sort(nums);
          for(int i = 0;i<nums.length;i++){
             long lbound = firstOccurrence(nums,i+1,nums.length-1,lower-nums[i]);
             long ubound = firstOccurrence(nums,i+1,nums.length-1,upper-nums[i]+1);
             count += (ubound-lbound);
          }
          return count;
    }
    public static long firstOccurrence(int nums[],int low, int high,int target){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] >= target)
              high = mid-1;
            else 
              low = mid+1;
        }
        return low;
    }
}