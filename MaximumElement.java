import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Deque;
public class MaximumElement{
    public static void main(String args[]){
         int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
         int k = 3;
         ArrayList<Integer> list = maximumElement(arr,k);
         for(int n : list)
           System.out.print(n+" ");
    }
    public static ArrayList<Integer> maximumElement(int arr[], int k){
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0;i<arr.length;i++){
            if(!deque.isEmpty() && deque.peekFirst() < i-k+1)  
              deque.pollFirst();
            while(!deque.isEmpty() && arr[deque.peekLast()] <= arr[i])
              deque.pollLast();
            deque.offerLast(i);
            if(i >= k-1)
              list.add(arr[deque.peekFirst()]);
        }
        return list;
    }
}