class LongestSubarray {
    public static void main(String args[]){
        int nums[] = {1,2,3,3,2};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
       int ans = 0;
        int current = 0;
        int maxValue = 0;
        for(int n : nums){
            if(maxValue < n){
                maxValue = n;
                ans = 0;
                current = 0;
            }
            if(maxValue == n)
                current++;
            else 
                current = 0;
            ans = Math.max(ans,current);
        }
        return ans;
    }
}