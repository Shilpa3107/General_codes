public class BubbleSort{
    public static void main(String args[]){
     int arr[] = {1,4,7,2,5,1,0,6,4,5};
     for(int n : arr)
       System.out.print(n+" ");
    System.out.println("\nAfter sorting : ");
      bubbleSort(arr);
      for(int n : arr)
        System.out.print(n+" ");
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}