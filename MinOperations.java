import java.util.HashSet;
public class MinOperations{
    public static void main(String args[]){
        int nums[] = {5,2,5,4,5};
        System.out.println(minOperations(nums,2));
    }
    public static int minOperations(int nums[],int k){
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(n < k)
              return -1;
            else if(n > k)
              set.add(n);
        }
        return set.size();
    }
}