import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Map;
class FindXSum{
    public static void main(String args[]){
        int nums[] = {1,1,2,2,3,4,2,3};
        int k = 6;
        int x = 2;
        int arr[] = findXSum(nums,k,x);
        for(int n: arr)
        System.out.print(n+" ");
    }
    public static int[] findXSum(int[] nums, int k, int x) {
        int ans[] = new int[nums.length-k+1];
        for(int i = 0;i<nums.length-k+1;i++){
            int subarray[] = subarray(nums,k,i);
            List<Map.Entry<Integer,Integer>> list = sortedfrequency(subarray);
            ans[i] = sum(list,x);
        }
        return ans;
    }
    public static int sum(List<Map.Entry<Integer,Integer>> list, int x){
        int sum = 0;
        for(int i = 0; i < x && i < list.size(); i++){
            int key = list.get(i).getKey();
            int freq = list.get(i).getValue();
            sum += key*freq;
        }
            return sum;
    }
    public static int[] subarray(int nums[],int k, int ind){
        int subarray[] = new int[k];
        for(int i = 0;i<k;i++)
            subarray[i] = nums[ind+i];
        return subarray;
    }
    public static List<Map.Entry<Integer,Integer>> sortedfrequency(int subarray[]){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n : subarray)
            map.put(n,map.getOrDefault(n,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(p1,p2)->{
            if(p1.getValue().equals(p2.getValue()))
                return p2.getKey().compareTo(p1.getKey());
            return p2.getValue().compareTo(p1.getValue());
        });
        return list;
    }
}