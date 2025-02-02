public class ArraySorted{
    public static void main(String args[]){
        int nums[] = {3,4,5,1,2};
        System.out.println(arraySorted(nums));
    }
    public static boolean arraySorted(int nums[]){
        //count the number of elements which are not in non decreasing order
       int count = 0;

       //traverse the array to check if array is sorted or not
       for(int i = 0;i<nums.length;i++){

        //checking if left side elements is greater than right side elements
        if(nums[i] > nums[(i+1)%nums.length])

        //if found increase the value of count
           count++;

        //if the array is rotated then count value will be 1 but if value of count is more than 1 it means it is not sorted
        if(count > 1)

        //return false since array is not sorted
          return false;
       }

       //return true as array is sorted
       return true;
    }
}