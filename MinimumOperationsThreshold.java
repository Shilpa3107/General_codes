import java.util.PriorityQueue;
public class MinimumOperationsThreshold{
    public static void main(String args[]){
       int nums[] = {2,11,10,1,3};
       int k = 10;
       System.out.println(minimumOperationsThreshold(nums,k));
    }
    public static int minimumOperationsThreshold(int nums[], int k){
        //create a priority queue 
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        //to count operations
        int count = 0;

        //traverse the array to store elements in priority queue
        for(int n : nums)
          pq.offer((long)n);

        //traverse the priority queue based on condition
        while(pq.peek() < k && pq.size() >= 2){
            long x = pq.poll();
            long y = pq.poll();
            pq.offer(x*2+y);
            count++;
        }
        return count;
    }
}