import java.util.ArrayList;
import java.util.Collections;

class Chocolate_Distribution
{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(56);
        list.add(7);
        list.add(9);
        list.add(12);
        System.out.println(findMinDiff(list,list.size(),5));
    }
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int min = Integer.MAX_VALUE;
        int i = 0, j = m-1;
        while(j<n){
            int diff = a.get(j)-a.get(i);
            min = Math.min(diff,min);
            i++;
            j++;
        }
        return min;
    }
}