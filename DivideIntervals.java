import java.util.PriorityQueue;
import java.util.Arrays;
public class DivideIntervals{
    public static void main(String args[]){
        int intervals[][] = {{5,10},{6,8},{1,5},{2,3},{1,10}};
        System.out.println(minimumGroup(intervals));
    }
    public static int minimumGroup(int intervals[][]){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] n : intervals){
            if(!pq.isEmpty() && pq.peek() < n[0])
             pq.poll();
             pq.offer(n[1]);
        }
        return pq.size();
    }
}