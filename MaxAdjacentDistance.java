public class  MaxAdjacentDistance{
    public static void main(String args[]){
        int nums[] = {1,2,4};
        System.out.println(maxAdjacentDistance(nums));
    }
    public static int maxAdjacentDistance(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max, Math.abs(nums[i] - nums[(i + 1) % nums.length]));
        }
        return max;
    }
}