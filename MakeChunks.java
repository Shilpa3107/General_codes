public class MakeChunks{
    public static void main(String args[]){
       int arr[] = {4,3,2,1,0};
       System.out.println(makeChunks(arr));
    }
    public static int makeChunks(int arr []){
        int expected = 0, target = 0, chunk = 0;
        for(int i = 0;i<arr.length;i++){
            expected += i;
            target += arr[i];
            if(expected == target)
              chunk++;
        }
        return chunk;
    }
}