import java.util.PriorityQueue;
public class QueryKthSmallest{
    public static void main(String args[]){
       String nums[] = {"102","473","251","814"};
       int queries[][] = {{1,1},{2,3},{4,2},{1,2}};
       int arr[] = queryKthSmallest(nums,queries);
       for(int n : arr)
         System.out.print(n+" ");
    }
    public static int[] queryKthSmallest(String nums[], int queries[][]){
        int arr[] = new int[queries.length];
        for(int i = 0;i<queries.length;i++){
            int k = queries[i][0]-1;
            int trim = queries[i][1];
            PriorityQueue<String[]> pq = new PriorityQueue<>((a,b)->{
                if(!a[1].equals(b[1]))
                 return a[1].compareTo(b[1]);
                else
                 return Integer.valueOf(a[0])-Integer.valueOf(b[0]);
            });
            for(int j = 0;j<nums.length;j++){
                 String trimmed = nums[j].substring(nums[j].length()-trim);
                 pq.offer(new String[]{Integer.toString(j),trimmed});
            }
            while(k-->0)
              pq.poll();
            arr[i] = Integer.parseInt(pq.poll()[0]);
        }
        return arr;
    }
}