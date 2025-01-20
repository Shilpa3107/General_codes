import java.util.HashSet;
public class KDiffArray{
    public static void main(String args[]){
        int nums[] = {3,1,4,1,5};
        int k = 2;
        System.out.println(kDiffArray(nums,k));
    }
    public static int kDiffArray(int nums[], int k){
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(i != j && Math.abs(nums[i]-nums[j])==k){
                String s = nums[i] < nums[j] ? nums[i]+","+nums[j]:nums[j]+","+nums[i];
                if(!set.contains(s)){
                    count++;
                    set.add(s);
                }
            }
            }
        }
        return count;
    }
}