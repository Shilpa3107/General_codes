import java.util.HashMap;
public class TuplePairs{
    public static void main(String args[]){
        int nums[] = {2,3,4,6};
        System.out.println(tupleSameProduct(nums));
    }
    public static int tupleSameProduct(int[] nums) {
        //created a hashmap to store the product with its frequency
        HashMap<Integer,Integer> map = new HashMap<>();

        //count the number of pairs
        int count = 0;

        //traverse the array to find the product of the pairs
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){

                //product value is stored where i!=j
                int product = nums[i]*nums[j];

                //store the tuples 
                count += map.getOrDefault(product,0)*8;

                //store the product value and count the frequency
                map.put(product,map.getOrDefault(product,0)+1);
            }
        }

        return count;
    }
}