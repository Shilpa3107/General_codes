public class BestSightSeeing{
    public static void main(String args[]){
       int values[] = {8,1,5,2,6};
       System.out.println(bestSightSeeing(values));
    }
    public static int bestSightSeeing(int values[]){
        int m = values[0];
        int ans = 0;
        for(int i = 1;i<values.length;i++){
            if(m+values[i]-i > ans)
              ans = m+values[i]-i;
            if(values[i]+i > m)
               m = values[i]+i;
        }
        return ans;
    }
}