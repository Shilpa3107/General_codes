public class MaxTriplet1{
    public static void main(String args[]){
         int nums[] = {12,6,1,2,7};
         System.out.println(maxTriplet1(nums));
    }
    public static long maxTriplet1(int nums[]){
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        long result = 0;
        for(int i = 1;i<nums.length;i++){
            prefix[i] = Math.max(prefix[i-1],nums[i-1]);
            suffix[nums.length-1-i] = Math.max(suffix[nums.length-i],nums[nums.length-i]);
        }
        for(int j = 1;j<nums.length-1;j++){
            result = Math.max(result,(long)(prefix[j]-nums[j])*suffix[j]);
        }
        return result;
    }
}