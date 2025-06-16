public class MaxDifference2{
    public static void main(String args[]){
         int nums[] = {7,1,5,4};
         System.out.println(maxDifference(nums));
    }
    public static int maxDifference(int nums[]){
        int max = -1;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]<nums[j])
                  max = Math.max(max,nums[j]-nums[i]);
            }
        }
        return max;
    }
}