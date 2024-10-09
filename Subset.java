import java.util.ArrayList;
import java.util.List;
public class Subset{
    public static void main(String args[]){
        int nums[] = {1,2,3};
        System.out.println(subset(nums));
    }
    public static List<List<Integer>> subset(int nums[]){

        List<List<Integer>> listoflist = new ArrayList<>();
        generatesubset(0,nums,new ArrayList<Integer>(), listoflist);
        return listoflist;
    }
    public static void generatesubset(int index, int nums[], List<Integer> current , List<List<Integer>> listoflist){
        listoflist.add(new ArrayList<>(current));
        for(int i = index;i<nums.length;i++){
            current.add(nums[i]);
            generatesubset(i+1,nums, current, listoflist);
            current.remove(current.size()-1);
        }
    }
}