public class MaximumProductSubarray{
    public static void main(String args[]){
        int nums[] = {2,3,-2,4};
        System.out.println(maximumProductSubarray(nums));
    }
    public static int maximumProductSubarray(int nums[]){
        int leftToRIght = 1, rightToLeft = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(leftToRIght == 0)
              leftToRIght = 1;
            if(rightToLeft == 0)
              rightToLeft = 1;
            leftToRIght *= nums[i];
            int j = nums.length-i-1;
            rightToLeft *= nums[j];
            max = Math.max(max,Math.max(leftToRIght,rightToLeft));
        }
        return max;
    }
}