import java.util.*;
class Relative_Sort_Array {
    public static void main(String args[]){
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        arr1 = relativeSortArray(arr1,arr2);
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<arr2.length;i++){
            int count = frequency(arr1,arr2[i]);
            for(int j = 0;j<count;j++){
                list.add(arr2[i]);
            }
        }
        Arrays.sort(arr1);
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] != -1){
                list.add(arr1[i]);
                arr1[i] = -1;
            }
        }
       for(int i = 0;i<arr1.length;i++){
           arr1[i] = list.get(i);
       }
        return arr1;
    }
    public static int frequency(int arr1[], int n){
        int count = 0;
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] == n){
                count++;
                arr1[i] = -1;
            }
        }
        return count;
    }
}