import java.util.Arrays;
public class MergeTwoArrays{
    public static void main(String args[]){

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        mergeTwoArrays(nums1,3,nums2,3);
        for(int n : nums1)
          System.out.print(n+" ");

    }
    public static void mergeTwoArrays(int nums1[], int m , int nums2[], int n){
        //define the position from where nums1[] is empty to store the elements of nums2[]
        int i = m;

        //traverse the array
        for(int j = 0;j<nums2.length;j++){
          
            //store elements in the empty space in the array
            nums1[i] = nums2[j];

            //move to the next empty position
            i++;
        }

        Arrays.sort(nums1);
    }
}