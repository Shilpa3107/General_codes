public class BitwiseXor{
    public static void main(String args[]){
       int nums1[] = {2,1,3};
       int nums2[] = {10,2,5,0};
       System.out.println(bitwiseXor(nums1,nums2));
    }
    public static int bitwiseXor(int nums1[], int nums2[]){
        int result = 0, c1 = 0, c2 = 0;
        if(nums1.length%2!=0){
            for(int n : nums2)
              c1 = c1^n;
            result = result^c1;
        }
        if(nums2.length%2!=0){
            for(int n : nums1)
              c2 = c2^n;
            result = result^c2;
        }
        return result;
    }
}