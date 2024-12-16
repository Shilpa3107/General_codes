public class FinalArrayState{
    public static void main(String args[]){
        int nums[] = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;
        nums = findArrayState(nums,k,multiplier);
        for(int n : nums)
          System.out.print(n+" ");
    }
    public static int[] findArrayState(int nums[], int k, int multiplier){
        while(k-->0){
            nums[getInd(nums)] *= multiplier;
        }
        return nums;
    }
    public static int getInd(int nums[]){
        int min = Integer.MAX_VALUE;
        int ind = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
                ind = i;
            }
        }
        return ind;
    }
}