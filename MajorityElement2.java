import java.util.HashMap;
class MajorityElement2 {
  public static void main(String args[]){
    int nums[] = {3,2,3};
    System.out.println(majorityElement(nums));
  }
    public static int majorityElement(int[] nums) {
        //create a hashmap to store the frequency of each element
        HashMap<Integer,Integer> map = new HashMap<>();

        //traverse the array to store element with its frequency
        for(int n : nums)
          map.put(n,map.getOrDefault(n,0)+1);
        
        //finding the majority element
        for(int n : map.keySet()){
            if(map.get(n) > nums.length/2)
              return n;
        }
         
         //if no element exists 
         return -1;
    }
}