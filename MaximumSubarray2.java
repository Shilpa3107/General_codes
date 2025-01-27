import java.util.HashMap;
public class MaximumSubarray2{
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6};
        int k = 1;
        System.out.println(maximumSubarray(nums,k));
    }
    public static int maximumSubarray(int nums[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
           map.put(n,map.getOrDefault(n,0)+1);
        int res = 0;
        for(int n : map.keySet()){
            res = Math.max(res,kadane(nums,k,n));
        }
        return map.getOrDefault(k,0)+res;
    }
    public static int kadane(int nums[], int k , int freq){
        int res = 0, curr = 0;
        for(int n : nums){
            if(n==k)
              curr--;
            if(n==freq)
            curr++;
            if(curr<0)
             curr = 0;
            res = Math.max(res,curr);
        }
        return res;
    }
}