public class MaximumSubarray3{
    public static void main(String args[]){
        int nums[] = {-2,-1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(nums));
    }
    public static int maximumSubarray(int nums[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            curr += n;
            if(curr > max)
              max = curr;
            if(curr < 0)
              curr = 0;
        }
        return max;
    }
}