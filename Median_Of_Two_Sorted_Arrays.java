import java.util.Arrays;
class Median_Of_Two_Sorted_Arrays {
    public static void main(String args[]){
        int nums1[] = {1,3};
        int nums2[] = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        for(int i = 0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        for(int i = 0,j = nums1.length;i<nums2.length && j<(nums1.length+nums2.length);i++,j++){
            arr[j] = nums2[i];
        }
        Arrays.sort(arr);
        int totalLength = nums1.length+nums2.length;
        double result = 0.0;
        if(totalLength % 2 == 1){
            int mid = totalLength/2;
            result = arr[mid];
            
        }
        else{
            int mid1 = (totalLength/2)-1;
            int mid2 = (totalLength/2);
            result = (arr[mid1]+arr[mid2])/2.0; 
        }
        
        return result;
    }
}