import java.util.HashMap;
public class NiceSubarrays{
    public static void main(String args[]){
        int nums[] = {1,1,2,1,1};
        int k = 2;
        System.out.println(niceSubarrays(nums,k));
    }
    public static int niceSubarrays(int nums[], int k){
        int odd = 0;
        int count = 0;
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        for(int n : nums){
            if(n%2 != 0)
             odd++;
            count += prefixSum.getOrDefault(odd-k,0);
            prefixSum.put(odd,prefixSum.getOrDefault(odd,0)+1);
        }
        return count;
    }
}