import java.util.Arrays;
public class PartitionaArray1{
    public static void main(String args[]){
         int nums[] = {3,6,1,2,5};
         System.out.println(partitionArray(nums,2));
    }
    public static int partitionArray(int nums[],int k){
        Arrays.sort(nums);
        int rec = nums[0];
        int ans = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]-rec > k){
                ans++;
                rec = nums[i];
            }
        }
        return ans;
    }
}