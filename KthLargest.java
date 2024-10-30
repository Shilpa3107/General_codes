import java.util.Collections;
import java.util.PriorityQueue;
public class KthLargest{
    public static void main(String args[]){
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(largest(nums,k));
    }
    public static int largest(int nums[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n : nums)
          pq.offer(n);
        while(k-->1)
          pq.poll();
        return pq.poll();
    }
}