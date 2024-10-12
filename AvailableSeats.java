import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;
public class AvailableSeats{
    public static void main(String args[]){
        int times[][] = {{1,4},{2,3},{4,6}};
        int targetfriend = 1;
        System.out.println(seats(times,targetfriend));
    }
    public static int seats(int times[][], int targetfriend){
        int n = times.length;
        Integer order[] = new Integer[n];
        for(int i = 0;i<n;i++)
        order[i] = i;
        Arrays.sort(order,(a,b)->Integer.compare(times[a][0],times[b][0]));
        PriorityQueue<Integer> emptySeat = new PriorityQueue<Integer>();
        PriorityQueue<int []> timedSeat = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        for(int i = 0;i<n;i++)
        emptySeat.offer(i);
        for(int i : order){
            int arrival = times[i][0];
            int depart = times[i][1];
            while(!timedSeat.isEmpty() && timedSeat.peek()[0] <= arrival)
            emptySeat.offer(timedSeat.poll()[1]);
            int seat = emptySeat.poll();
            if(i == targetfriend)
            return seat;
            timedSeat.offer(new int[]{depart,seat});
        }
        return -1;
    }
}