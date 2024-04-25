import java.util.*;
class CommonElements {
    public static void main(String args[]){
        int nums1[] = {4,3,2,3,1};
        int nums2[] = {2,2,5,2,3,6};
        int result[] = findIntersectionValues(nums1,nums2);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1 = 0, count2 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
         for(int i = 0;i<nums2.length;i++){
             for(int j = 0;j<nums1.length;j++){
            if(nums2[i] == nums1[j])
                list.add(nums2[i]); // all common elements
           }
         }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: list){
            set.add(i);
        }
        count1 = count(nums1,set,count1);
        count2 = count(nums2,set,count2);
        int arr[] = new int[2];
        arr[0] = count1;
        arr[1] = count2;
        return arr;
        
    }
    public static int count(int nums1[],HashSet<Integer> set, int count){
        for(int i = 0;i<nums1.length;i++){
            for(int j: set){
                if(j == nums1[i])
                    count++;
            }
        }
        return count;
    }

}