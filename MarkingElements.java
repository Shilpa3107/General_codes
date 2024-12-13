import java.util.PriorityQueue;
public class MarkingElements{
    public static void main(String args[]){
       int nums[] = {2,1,3,4,5,2};
       System.out.println(markingElements(nums));
    }
    public static int markingElements(int nums[]){
        int score = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
          if(a[0]!=b[0])
            return a[0]-b[0];
         return a[1]-b[1];
        });
        boolean visited[] = new boolean[nums.length];
        for(int i = 0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
        }
        while(!pq.isEmpty()){
            int curr[] = pq.poll();
            int val = curr[0];
            int ind = curr[1];
            if(visited[ind])
            continue;
            score += val;
            if(ind-1 >= 0)
              visited[ind-1] = true;
            if(ind+1 < nums.length)
              visited[ind+1] = true;
        }
        return score;
    }
}