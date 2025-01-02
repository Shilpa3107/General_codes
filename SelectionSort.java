public class SelectionSort{
    public static void main(String args[]){
      int arr[] = {5,2,8,1,0,3,8,5,4,7,6,1};
      for(int n : arr)
       System.out.print(n+" ");
       System.out.println("\nAfter sorting : ");
       selectionSort(arr);
       for(int n : arr)
         System.out.print(n+" ");
    }
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i =0;i<n;i++){
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