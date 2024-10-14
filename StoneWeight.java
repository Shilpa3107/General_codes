import java.util.PriorityQueue;
import java.util.Collections;
public class StoneWeight{
    public static void main(String args[]){
        int nums[] = {2,7,4,1,8,1};
        System.out.println(stoneWeight(nums));
    }
    public static int stoneWeight(int nums[]){
        //to implement max-heap operation
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n: nums)
        pq.offer(n);
        while(pq.size() > 1){
            int y = pq.poll();
            int x = pq.poll();
            if(x!=y)
            pq.offer(y-x);
        }
        return pq.isEmpty()?0:pq.poll();
    }
}