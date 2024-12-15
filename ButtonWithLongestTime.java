import java.util.ArrayList;
import java.util.PriorityQueue;
class ButtonWithLongestTime {
    public static void main(String args[]){
        int events[][] = {{1,2},{2,5},{3,9},{1,15}};
        System.out.println(buttonWithLongestTime(events));
    }
    public static int buttonWithLongestTime(int[][] events) {
       ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<events.length;i++){
            list.add(events[i][1]);
        }
        for(int i = 1,j=0; i< events.length && j < list.size();i++,j++){
            events[i][1] = events[i][1]-list.get(j); 
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])
                return b[1]-a[1];
            if(a[0]!=b[0])
                return a[0]-b[0];
            return 0;
        });
        for(int n[]: events)
            pq.offer(new int[]{n[0],n[1]});
        int n[] = pq.poll();
        return n[0];
    }
}