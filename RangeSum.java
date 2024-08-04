import java.util.ArrayList;
import java.util.Collections;
class RangeSum {
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int n = 5;
        int left = 1;
        int right = 5;
        System.out.println(rangeSum(nums,n,left,right));
    }
    public static int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum = sum+nums[j];
                list.add(sum);
            }
            sum = 0;
        }
        Collections.sort(list);
        long sum = 0;
        long mod = 1000000007;
        for(int i = left;i<=right;i++){
            sum = sum+list.get(i-1);
        }
        return (int)(sum%mod);
    }
}