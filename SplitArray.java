public class SplitArray{
    public static void main(String args[]){
        int nums[] = {10,4,-8,7};
        System.out.println(splitArray(nums));
    }
    public static int splitArray(int nums[]){
       long totalSum = 0, prefix = 0, suffix = 0;
       int count = 0;
       for(int n : nums)
         totalSum += n;
       for(int i = 0;i<nums.length-1;i++){
        prefix += nums[i];
        suffix = totalSum-prefix;
        if(prefix >= suffix)
          count++;
       }
       return count;
    }
}