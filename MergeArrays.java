import java.util.HashMap;
import java.util.Arrays;
public class MergeArrays{
    public static void main(String args[]){
        int nums1[][] = {{1,2},{2,3},{4,5}};
        int nums2[][] = {{1,4},{3,2},{4,1}};
        int result[][] = mergeArrays(nums1,nums2);
        for(int n[] : result)
          System.out.println(n[0]+" "+n[1]);
    }
    public static int[][] mergeArrays(int nums1[][], int nums2[][]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n[] : nums1)
          map.put(n[0],n[1]);
        for(int n[] : nums2)
          map.put(n[0],map.getOrDefault(n[0],0)+n[1]);
        int result[][] = new int[map.size()][2];
        int i = 0;
        for(int n : map.keySet()){
            result[i][0] = n;
            result[i][1] = map.get(n);
            i++;
        }
        Arrays.sort(result,(a,b)->Integer.compare(a[0],b[0]));
        return result;
        
    }
}