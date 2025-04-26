public class FixedSubarray{
    public static void main(String args[]){
        int nums[] = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        System.out.println(fixedSubarray(nums,minK,maxK));
    }
    public static long fixedSubarray(int nums[], int minK, int maxK){
        long count = 0;
        int minPos = -1, maxPos = -1, badPos = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < minK || nums[i] > maxK)
              badPos = i;
            if(nums[i]==minK)
              minPos = i;
            if(nums[i] == maxK)
              maxPos = i;
            int minValid = Math.min(minPos,maxPos);
            if(minValid > badPos)
              count += minValid-badPos;
        }
        return count;
    }
}