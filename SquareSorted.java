import java.util.Arrays;
public class SquareSorted{
    public static void main(String args[]){

        int nums[] = {-4,-1,0,3,10};
        nums = square(nums);
        for(int n : nums)
        System.out.print(n+" ");
    }
    public static int[] square(int nums[]){
        for(int i = 0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}