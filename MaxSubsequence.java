import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
class MaxSubsequence {
  public static void main(String args[]){
    int nums[] = {2,2,1,-2,3};
    int k = 2;
    MaxSubsequence obj = new MaxSubsequence();
    int ans[] = obj.maxSubsequence(nums,k);
    for(int n : ans)
       System.out.print(n+" ");
  }
    public int[] maxSubsequence(int[] nums, int k) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
          list.add(new int[]{nums[i],i});
        list.sort((a,b)->b[0]-a[0]);
        List<int[]> topK = new ArrayList<>();
        topK = list.subList(0,k);
        topK.sort(Comparator.comparingInt(a->a[1]));
        int result[] = new int[k];
        for(int i = 0;i<k;i++)
          result[i] = topK.get(i)[0];
        return result;
    }
}