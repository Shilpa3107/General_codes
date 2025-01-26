public class CountPartition{
    public static void main(String args[]){
        int nums[] = {10,10,3,7,6};
        System.out.println(countPartition(nums));
    }
    public static int countPartition(int nums[]){
        int sumL = 0, sumR = 0, count = 0;
        for(int n : nums)
          sumR += n;
        sumR -= nums[0];
        sumL += nums[0];
        for(int i = 1;i<nums.length;i++){
            if(Math.abs(sumL-sumR)%2 == 0)
              count++;
            sumL += nums[i];
            sumR -= nums[i];
        }
        return count;
    }
}