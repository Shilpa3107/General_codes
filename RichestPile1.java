import java.util.PriorityQueue;
import java.util.Collections;
public class RichestPile1{
    public static void main(String args[]){
     int gifts[] = {25,64,9,4,100};
     int k = 4;
     System.out.println(richestPile(gifts,k));
    }
    public static long richestPile(int gifts[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n : gifts)
          pq.offer(n);
        while(k-->0)
          pq.offer((int)Math.sqrt(pq.poll()));
        long sum = 0;
        while(!pq.isEmpty())
           sum = sum+(long)pq.poll();
        return sum;
    }
}