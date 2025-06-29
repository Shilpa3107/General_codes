import java.util.Arrays;
class NumSubseq {
    public static void main(String[] args) {
        NumSubseq solution = new NumSubseq();
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        System.out.println(solution.numSubseq(nums, target)); 
    }
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007 , n = nums.length;
        Arrays.sort(nums);
        
        int[] power = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        int left = 0 , right = n - 1 , result = 0;

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                result = (result + power[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}