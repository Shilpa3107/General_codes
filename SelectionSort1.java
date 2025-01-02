public class SelectionSort1{
    public static void main(String args[]){
        int arr[] = {1,4,7,2,5,1,0,6,4,5};
     for(int n : arr)
       System.out.print(n+" ");
    System.out.println("\nAfter sorting : ");
      selectionSort(arr);
      for(int n : arr)
        System.out.print(n+" ");
    }
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minIndex])
                 minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}