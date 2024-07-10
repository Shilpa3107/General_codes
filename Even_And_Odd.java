import java.util.ArrayList;
class Even_And_Odd {
    public static void main(String args[]){
        int arr[] = {3, 6, 12, 1, 5, 8};
        int N = 6;
        reArrange(arr,N);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reArrange(int[] arr, int N) {
        // code here
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0)
            even.add(arr[i]);
            else 
            odd.add(arr[i]);
        }
        int ind = 0;
        for(int i = 0;i<N;i++){
            if(i%2==0){
            arr[i] = even.get(ind);
            ind++;
            }
        }
        ind = 0;
        for(int i = 0;i<N;i++){
            if(i%2!=0){
            arr[i] = odd.get(ind);
            ind++;
            }
        }
        
    }
}