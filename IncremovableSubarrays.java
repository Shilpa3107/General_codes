public class IncremovableSubarrays{
    public static void main(String args[]){
        int arr[] = {6,5,7,8};
        System.out.println(incremovableSubarrays(arr));
    }
    public static int incremovableSubarrays(int arr[]){
        int c = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int last = 0;
                boolean flag = true;
                for(int k = 0;k<arr.length;k++){
                    if(k >= i && k <= j)
                      continue;
                    if(last >= arr[k]){
                        flag = false;
                        break;
                    }
                    last = arr[k];
                }
                if(flag)
                  c++;
            }
        }
        return c;
    }
}