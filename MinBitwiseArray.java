import java.util.ArrayList;
import java.util.List;
class MinBitwiseArray {
    public static void main(String args[]){
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(7);
        int arr[] = minBitwiseArray(nums);
        for(int n : arr)
        System.out.print(n+" ");
    }
    public static int[] minBitwiseArray(List<Integer> nums) {
        int ans[] = new int[nums.size()];
        
        for(int i = 0;i<nums.size();i++){
            boolean flag = false;
           for(int n = 0;n<=1000;n++){
               int k = n|(n+1);
               if(k == nums.get(i))
               {
                   ans[i] = n;
                   flag = true;
                   break;
               }
           }
            if(!flag)
                ans[i] = -1;
        }
        return ans;
    }
}