public class MaximumSubarray1{
    public static void main(String args[]){
       int nums[]={-2,1,-3,4,-1,2,1,-5,4};
       System.out.println(maximumSubarray(nums));
    }
    public static int maximumSubarray(int nums[]){
        int curr = 0 , max = Integer.MIN_VALUE;
        for(int n : nums){
            curr += n;
            if(max < curr)
              max = curr;
            if(curr < 0)
              curr = 0;
        }
        return max;
    }
}