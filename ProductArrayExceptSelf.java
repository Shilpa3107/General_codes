public class ProductArrayExceptSelf{ 
      public static void main(String args[]){
          int nums[] = {1,2,3,4};
          nums = productArrayExceptSelf(nums);
          for(int n : nums)
            System.out.print(n+" ");
      }
      public static int[] productArrayExceptSelf(int[] nums) {
        //created to store the product of the prefix
           int prefix[] = new int[nums.length];
    
        //created to store the product of the suffix
           int suffix[] = new int[nums.length];
    
        //intitialize it with value 1
           prefix[0] = 1;
           suffix[nums.length-1] = 1;
    
        //storing prefix product
           for(int i = 1;i<nums.length;i++)
             prefix[i] = prefix[i-1]*nums[i-1];
    
        //storing suffix product
           for(int i = nums.length-2;i>=0;i--)
             suffix[i] = suffix[i+1]*nums[i+1];
    
        //storing the product of array except self
            for(int i = 0;i<nums.length;i++)
              nums[i] = prefix[i]*suffix[i];
    
        //return the resultant array
            return nums;  
        }
}