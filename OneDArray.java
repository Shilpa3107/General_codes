public class OneDArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Traversing : ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("\nAverage: "+sum/arr.length);
    }
}
