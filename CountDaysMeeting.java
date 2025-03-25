public class CountDaysMeeting{
    public static void main(String args[]){
         int days = 10;
         int meeting[][] = {{5,7},{1,3},{9,10}};
         System.out.println(countDaysMeeting(days,meeting));
    }
    public static int countDaysMeeting(int days, int meeting[][]){
        int free = 0, lastEnd = 0;
        for(int n[]: meeting){
            int start = n[0], end = n[1];
            if(start > lastEnd+1){
                free += start-lastEnd-1;
            }
            lastEnd = Math.max(end,lastEnd);
        }
        free += days-lastEnd;
        return free;
    }
}