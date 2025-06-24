import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class KDistant{
    public static void main(String args[]){
       int nums[]={3,4,9,1,3,9,5};
       int key = 9;
       int k = 1;
       List<Integer> list = kDistant(nums,key,k);
       for(int n : list)
         System.out.print(n+" ");
    }
    public static List<Integer> kDistant(int nums[], int key, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(Math.abs(i-j)<=k && nums[j]==key)
                   set.add(i);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}