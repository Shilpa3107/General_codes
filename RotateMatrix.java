public class RotateMatrix{
    public static void main(String args[]){
      int nums[] = {1,2,3,4,5,6,7};
      int k = 3;
      rotate(nums,k);
      for(int n : nums)
        System.out.print(n+" ");
    }
    public static void rotate(int[] nums, int k) {
        // finding the remainder to make sure it remains inside the length of array
           k = k%nums.length;
    
           //create an array to store the rotated elements
           int rotated[] = new int[nums.length];
    
           //place elements in their rotated position
           for(int i = 0;i<nums.length;i++)
             rotated[(i+k)%nums.length] = nums[i];
    
            //place elements in original array
            for(int i = 0;i<nums.length;i++)
             nums[i] = rotated[i];
    }
}