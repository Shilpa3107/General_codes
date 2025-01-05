import java.util.PriorityQueue;
public class WiggleSort{
    public static void main(String args[]){
       int nums[] = {1,5,1,1,6,4};
       wiggleSort(nums);
       for(int n : nums)
         System.out.print(n+" ");
    }
    public static void wiggleSort(int nums[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int n : nums)
          pq.offer(n);
        for(int i = 1;i<nums.length;i=i+2)
          nums[i] = pq.poll();
        for(int i = 0;i<nums.length;i=i+2)
          nums[i] = pq.poll();
    }
}