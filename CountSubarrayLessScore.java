public class CountSubarrayLessScore{
    public static void main(String args[]){
        System.out.println(countSubarrayLessScore(new int[]{2,1,4,3,5}, 10));
    }
    public static long countSubarrayLessScore(int nums[], int k){
        long res = 0, total = 0;
        for(int i = 0, j = 0;j<nums.length;j++){
            total += nums[j];
            while(i<=j && total*(j-i+1)>=k){
                total -= nums[i];
                i++;
            }
            res += (j-i+1);
        }
        return res;
    }
}