import java.util.List;
import java.util.ArrayList;
public class SumSubsetXOR{
    public static void main(String args[]){
        int nums[] = {1,3};
        System.out.println(sumSubsetXOR(nums));
    }
    public static int sumSubsetXOR(int nums[]){
        //created lists of list to store all subsets of array
         List<List<Integer>> lists = new ArrayList<>();

         //call function to generate subset
         generateSubset(nums,0,new ArrayList<>(),lists);

         //define a variable to store the sum of all xor subset
         int sum = 0;

         //traverse the lists of list
         for(List<Integer> list : lists){

            //list contains a single element add it to the variable `sum`
            if(list.size() == 1)
              sum += list.get(0);

            //otherwise calculate xor and add it to the variable `sum`
            else{
                int count = list.get(0);
                for(int i = 1;i<list.size();i++)
                  count ^= list.get(i);
                sum +=count;
            }
         }

         //return the result
         return sum;
    }
    //generate all subsets of the array
    public static void generateSubset(int nums[], int ind, List<Integer> curr, List<List<Integer>> lists){
        if(!curr.isEmpty()){
            lists.add(new ArrayList<>(curr));
        }
        for(int i = ind;i<nums.length;i++){
            curr.add(nums[i]);
            generateSubset(nums,i+1,curr,lists);
            curr.remove(curr.size()-1);
        }
    }
}