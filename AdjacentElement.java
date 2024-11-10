import java.util.ArrayList;
import java.util.List;
public class AdjacentElement{
    public static void main(String args[]){
       List<Integer> nums = new ArrayList<>();
       nums.add(-15);
       nums.add(19);
       int k = 1;
       System.out.println(check(nums,k));
    }
    public static boolean check(List<Integer> nums, int k){
        if(nums.size() < 2*k)
        return false;
        for(int i = 0;i<nums.size()-2*k+1;i++){
            if(check(nums,i,i+k)){
                if(check(nums,i+k,i+2*k)){
                   return true;
                }
            }
        }
        return false;
    }
    public static boolean check(List<Integer> nums, int start, int end){
        for(int i = start;i<end-1;i++){
            if(nums.get(i) >= nums.get(i+1)){
                return false;
             }
        }
        return true;
    }
}