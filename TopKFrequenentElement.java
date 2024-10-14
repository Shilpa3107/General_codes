import java.util.Map;
import java.util.PriorityQueue;
import java.util.HashMap;
public class TopKFrequenentElement{
    public static void main(String args[]){
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        int arr[] = topKFrequenentElement(nums,k);
        for(int n: arr)
        System.out.print(n+" ");
    }
    public static int[] topKFrequenentElement(int nums[],int k){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n : nums)
        map.put(n,map.getOrDefault(n,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->Integer.compare(a.getValue(),b.getValue()));
        for(Map.Entry<Integer,Integer> mapEle : map.entrySet()){
            pq.offer(mapEle);
            if(pq.size() > k)
            pq.poll();
        }
        int arr[] = new int[k];
        int i = 0;
        while(!pq.isEmpty())
        arr[i++] = pq.poll().getKey();
        return arr;
    }
}