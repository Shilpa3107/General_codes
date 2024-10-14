import java.util.PriorityQueue;
public class FindKthLargetstElement{
    public static void main(String args[]){
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargetstElement(nums,k));
    }
    public static int findKthLargetstElement(int nums[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n: nums)
        pq.offer(n);
        while(pq.size() > k)
        pq.poll();
        return pq.poll();
    }
}