import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class MaximumSubsequence{
    public static void main(String args[]){
      int nums[] = {2,1,3,3};
      int k = 2;
      int result[] = maximumSubsequence(nums,k);
      for(int i = 0;i<k;i++)
        System.out.print(result[i]+" ");
    }
    public static int[] maximumSubsequence(int nums[], int k){
        List<int[]> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
           list.add(new int[]{nums[i],i});
        list.sort((a,b)->b[0]-a[0]);
        List<int[]> topK = list.subList(0,k);
        topK.sort(Comparator.comparingInt(a->a[1]));
        int result[] = new int[k];
        for(int i = 0;i<k;i++)
          result[i] = topK.get(i)[0];
        return result;
    }
}