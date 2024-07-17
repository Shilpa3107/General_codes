import java.util.HashMap;
class Subarray1 {
    public static void main(String args[]){
        int nums[] = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int ans = 0;
        int sum = 0;
        map.put(0,1);
        for(int num : nums){
            sum = (sum+num)%k;
            if(sum<0)
                sum +=k;
            ans += map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}