public class InsertionSort1{
    public static void main(String args[]){
        int arr[] = {1,4,7,2,5,1,0,6,4,5};
         for(int n : arr)
           System.out.print(n+" ");
        System.out.println("\nAfter sorting : ");
          insertionSort(arr);
          for(int n : arr)
            System.out.print(n+" ");
    }
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}