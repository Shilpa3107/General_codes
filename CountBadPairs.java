import java.util.HashMap;
public class CountBadPairs{
    public static void main(String args[]){

        int nums[] = {4,1,3,3};
        System.out.println(countBadPairs(nums));
    }
    public static long countBadPairs(int nums[]){
        //create a hashmap to store the number with frequencies
        HashMap<Integer,Integer> map = new HashMap<>();
         
        //create a variable
        long count = 0;

        //traverse the array
        for(int i = 0;i<nums.length;i++){
            count += map.getOrDefault(nums[i]-i,0);
            map.put(nums[i]-i,map.getOrDefault(nums[i],0)+1);
        }

        return (long) nums.length*(nums.length-1)/2-count;
    
    }
}