import java.util.Arrays;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;
public class Lexicographically{
    public static void main(String args[]){
        int nums[] = {1,5,3,9,8};
        int limit = 2;
        int res[] = lexicographically(nums,limit);
        for(int n : res)
          System.out.print(n+" ");
    }
    public static int[] lexicographically(int nums[], int limit){
        //to store the result
        int res[] = new int[nums.length];

        //to store the elements in its correct position
        int numsSort[][] = new int[nums.length][];
        
        //insert elements in the numsSort array
        for(int i = 0;i<nums.length;i++)
           numsSort[i] = new int[]{nums[i],i};
        
        //sort the array based on numbers
        Arrays.sort(numsSort,(a,b)->a[0]-b[0]);

        //create a map to group the numbers
        HashMap<Integer, Deque<Integer>> map = new HashMap<>();

        //Array to store number in original index
        int grpArr[] = new int[nums.length];
        int grpNo = 0;

        //insert elements in array and map
        grpArr[numsSort[0][1]] = grpNo;
        map.put(grpNo,new ArrayDeque<>());
        map.get(grpNo).addLast(numsSort[0][0]);

        //group elements within the limit
        for(int i = 1; i<nums.length;i++){
            if(numsSort[i][0]-map.get(grpNo).getLast() <= limit){
                map.get(grpNo).addLast(numsSort[i][0]);
                grpArr[numsSort[i][1]] = grpNo;
            }
            else{
                grpNo++;
                map.put(grpNo,new ArrayDeque<>());
                map.get(grpNo).addLast(numsSort[i][0]);
                grpArr[numsSort[i][1]] = grpNo; 
            }
        }
        
        for(int i = 0;i<nums.length;i++){
            res[i] = map.get(grpArr[i]).pollFirst();
        }
        return res;

    }
}