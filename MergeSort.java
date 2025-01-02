public class MergeSort{
    public static void main(String args[]){
        int arr[] = {3,5,7,1,0,3,5,7,1,9,3};
        for(int n : arr)
          System.out.print(n+" ");
        merge(arr,0,arr.length-1);
        System.out.println("\nAfter sorting : ");
        for(int n : arr)
          System.out.print(n+" ");
    }
    public static void merge(int arr[], int left, int right){
        if(left < right){
            int mid = left+(right-left)/2;
            merge(arr,left,mid);
            merge(arr,mid+1,right);
            mergeSort(arr,left,mid,right);
        }
    }
    public static void mergeSort(int arr[],int left,int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];
        for(int i = 0;i<n1;i++)
          leftArray[i] = arr[left+i];
        for(int j = 0;j<n2;j++)
           rightArray[j] = arr[mid+1+j];
        int i = 0, j= 0, k= left;
        while(i < n1 && j < n2){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }       
        while(j<n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        } 
    }
}