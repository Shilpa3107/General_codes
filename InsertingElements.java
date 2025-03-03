public class InsertingElements{
    public static void main(String args[]){
          int nums[] = {9,12,5,10,14,3,10};
          int pivot = 10;
          int result[] = insertingElements(nums,pivot);
          for(int n : result)
            System.out.print(n+" ");
    }
    public static int[] insertingElements(int nums[], int pivot){
        int ind = 0;
        int result[] = new int[nums.length];
        for(int n : nums){
            if(n < pivot)
              result[ind++] = n;
        }
        for(int n : nums){
            if(n == pivot)
              result[ind++] = n;
        }
        for(int n : nums){
            if(n > pivot)
              result[ind++] = n;
        }
        return result;
    }
}