import java.util.Arrays;
class CanBeEqual {
    public static void main(String args[]){
        int target[] = {1,2,3,4};
        int arr[] = {2,4,1,3};
        System.out.println(canBeEqual(target,arr));
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(Math.abs(arr[i]-target[i]) != 0)
            {
                count++;
                break;
            }
        }
        if(count>0)
            return false;
        else 
            return true;
    }
}