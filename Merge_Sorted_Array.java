import java.util.ArrayList;
import java.util.Collections;
class Merge_Sorted_Array {
    public static void main(String args[]){
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] ={2,3,4};
        int n = 3;
        merge(nums1,m,nums2,n);
        for(int i = 0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<m;i++){
            list.add(nums1[i]);
        }
        for(int i = 0;i<n;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = list.get(i);
        }
    }
}