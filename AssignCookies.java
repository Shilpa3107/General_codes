import java.util.Arrays;
public class AssignCookies{
    public static void main(String args[]){
       int greed[] = {1,2,3};
       int cookies[] = {3,3};
       System.out.println(assignCookies(greed,cookies));
    }
    public static int assignCookies(int greed[], int cookies[]){
        Arrays.sort(greed);
        Arrays.sort(cookies);
        int i = 0, j = 0, count = 0;
        while(i < greed.length && j < cookies.length){
            if(greed[i] <= cookies[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}