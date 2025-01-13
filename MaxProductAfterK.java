import java.util.PriorityQueue;
public class MaxProductAfterK{
    public static void main(String args[]){
       int nums[] = {0,4};
       int k = 5;
       System.out.println(maxProductAfterK(nums,k));
    }
    public static int maxProductAfterK(int nums[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums)
         pq.offer(n);
        while(k-->0)
          pq.offer(pq.poll()+1);
        long m = 1;
        while(!pq.isEmpty())
          m = (m*pq.poll())%1000000007;
        return (int)m;
    }
}