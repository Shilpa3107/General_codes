import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Ranges{
    public static void main(String args[]){
        List<List<Integer>> listoflist = new ArrayList<>();
            listoflist.add(Arrays.asList(4,10,15,24,26));
            listoflist.add(Arrays.asList(0,9,12,20));
            listoflist.add(Arrays.asList(5,18,22,30));
        int arr[] = range(listoflist);
        for(int n: arr)
        System.out.print(n+" ");
    }
    public static int[] range(List<List<Integer>> nums){
        PriorityQueue<Element> pq = new PriorityQueue<>((a,b)->a.value-b.value);
        int max = Integer.MIN_VALUE;
        int rangeEnd = Integer.MAX_VALUE;
        int rangeStart = 0;
        for(int i = 0;i<nums.size();i++){
            int value = nums.get(i).get(0);
            pq.offer(new Element(value,i,0));
            max = Math.max(max,value);
        }
        while(pq.size() == nums.size()){
            Element current = pq.poll();
            
            if(max-current.value < rangeEnd-rangeStart){
                rangeEnd = max;
                rangeStart = current.value;
            }
            if(current.col+1 < nums.get(current.row).size()){
                int nextValue = nums.get(current.row).get(current.col+1);
                pq.offer(new Element(nextValue,current.row,current.col+1));
                max = Math.max(max,nextValue);
            }
            else
               break;
        }
        return new int[]{rangeStart,rangeEnd};

    }
}
class Element{
    int value;
    int row;
    int col;
    Element(int val, int r, int c){
        value = val;
        row = r;
        col = c;
    }
}