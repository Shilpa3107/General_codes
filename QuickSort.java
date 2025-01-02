public class QuickSort{
    public static void main(String args[]){
      int arr[] = {8,6,0,1,5,2,7,3,9,4,6,1,9,0};
      for(int n : arr)
       System.out.print(n+" ");
       quickSort(arr, 0,arr.length-1);
      System.out.println("\nAfter sorting : ");
      for(int n : arr)
        System.out.print(n+" ");
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int i = low-1;
        int pivot = arr[high];
        for(int j = low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}