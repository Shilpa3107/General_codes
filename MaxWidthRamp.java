import java.util.Stack;
class MaxWidthRamp {
    public static void main(String args[]){
        int nums[] = {3,1,2};
        System.out.println(maxWidthRamp(nums));
    }
    public static int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0;i<nums.length;i++){
            if(stack.isEmpty() || nums[stack.peek()] > nums[i])
                stack.push(i);
        }
        int max = 0;
        for(int j = nums.length-1; j>= 0;j--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[j])
                max = Math.max(max,j-stack.pop());
        }
        return max;
    }
}