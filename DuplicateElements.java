import java.util.HashSet;
public class DuplicateElements{
    public static void main(String args[]){
        int nums[] = {1,1,2};
        System.out.println(duplicateElements(nums));
    }
    public static int duplicateElements(int nums[]){
        //create a hashset to store elements
        HashSet<Integer> set = new HashSet<>();

        //traverse through each elements
        int ind = 0;
        for(int n : nums){
            if(!set.contains(n)){
                set.add(n);
                nums[ind] = n;
                ind++;
            }
        }

        //size of hashset will be number of unique elements
        return set.size();
    }
}