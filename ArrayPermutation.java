public class ArrayPermutation{
    public static void main(String args[]){
        int result[] = arrayPermutation(new int[]{0,2,1,5,3,4});
        for(int n : result)
          System.out.print(n+" ");
    }
    public static int[] arrayPermutation(int nums[]){
        int ans[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}