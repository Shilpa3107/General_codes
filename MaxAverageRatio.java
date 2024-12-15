import java.util.PriorityQueue;
public class MaxAverageRatio{
    public static void main(String args[]){
     int classes[][] = {{1,2},{3,5},{2,2}};
     int extraStudents = 2;
     System.out.println(maxAverageRatio(classes,extraStudents));
    }
    public static double maxAverageRatio(int classes[][], int extraStudents){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            double gainA = getImprove(a[0],a[1]);
            double gainB = getImprove(b[0],b[1]);
            return Double.compare(gainB,gainA);
        });
        for(int c[] : classes)
          pq.offer(c);
        while(extraStudents-->0){
            int c[] = pq.poll();
            c[0]++;
            c[1]++;
            pq.offer(c);
        }
        double total = 0;
        for(int c[] : classes){
            total += (double)c[0]/c[1];
        }
        return total/classes.length;

    }
    public static double getImprove(int pass, int total){
        return ((double)(pass+1)/(total+1))/((double)pass/total);
    }
}