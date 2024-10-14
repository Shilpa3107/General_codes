import java.util.PriorityQueue;
import java.util.Collections;
public class MaxKElements{
    public static void main(String args[]){
        int nums[] = {672579538,806947365,854095676,815137524};
        int k = 3;
        System.out.println(maxKElements(nums,k));
    }
    public static long maxKElements(int nums[],int k){
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : nums)
        pq.offer((long)n);
        long sum = 0;
        while(k-->0){
            long n = pq.poll();
            sum = sum+n;
            pq.offer((long)Math.ceil(n/3.0));
        }
        return sum;
    }
}