import java.util.ArrayList;
public class RemoveElement{
    public static void main(String args[]){
        int nums[]= {3,2,3,2};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int nums[],int val){
       //created an arraylist to store the values which are not equal to val
       ArrayList<Integer> notVal = new ArrayList<>();

       //traverse through each element
       int ind = 0;
       for(int n : nums){
        if(n!=val){
            nums[ind] = n;
            notVal.add(n);
            ind++;
        }
       }

       //size of list will be number of elements which are not equal to val
       return notVal.size();
    }
}