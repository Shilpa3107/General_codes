class Max_Subarray{
    public static void main(String args[]){
        int arr[] = new int[5];
        for(int i= 0;i<5;i++){
            arr[i] = i+1;
        }
        int t = 3;
        int k = 0;
        for(int i = 0;i<=arr.length-t;i++){
            while(k < t){
                System.out.print(arr[i+k]+" ");
                k++;
            }
            System.out.println();
            k = 0;
            
        }
    }
}