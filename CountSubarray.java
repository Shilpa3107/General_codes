public class CountSubarray{
    public static void main(String args[]){
        int nums[] = {1,2,1,4,1};
        System.out.println(countSubarray(nums));
    }
    public static int countSubarray(int nums[]){
        int count = 0;
        for(int i = 1;i<nums.length-1;i++){
            if(nums[i] == (nums[i-1]+nums[i+1])*2)
              count++;
        }
        return count;
    }
}