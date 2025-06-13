import java.util.Arrays;
class MinimizeMaxPairs {
    public static void main(String args[]){
        int nums[] = {10,1,2,7,1,3};
        int p = 2;
        MinimizeMaxPairs solution = new MinimizeMaxPairs();
        int result = solution.minimizeMax(nums, p);
        System.out.println("Minimum maximum difference: " + result);
    }
    private int countValidPairs(int[] nums, int threshold) {
        int index = 0, count = 0;
        while (index < nums.length - 1) {
            // If a valid pair is found, skip both numbers.
            if (nums[index + 1] - nums[index] <= threshold) {
                count++;
                index++;
            }
            index++;
        }
        return count;
    }

    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = nums[n - 1] - nums[0];

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If there are enough pairs, look for a smaller threshold.
            // Otherwise, look for a larger threshold.
            if (countValidPairs(nums, mid) >= p) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left; 
    }
}
