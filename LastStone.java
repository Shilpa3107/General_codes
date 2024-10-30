import java.util.PriorityQueue;
import java.util.Collections;
public class LastStone{
    public static void main(String args[]){
        int nums[] = {2,7,4,1,8,1};
        System.out.println(lastStone(nums));
    }
    public static int lastStone(int nums[]){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n: nums)
           pq.offer(n);
        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            if(x != y)
               pq.offer(x-y);

        }
        return pq.isEmpty()?0:pq.poll();
        }
}