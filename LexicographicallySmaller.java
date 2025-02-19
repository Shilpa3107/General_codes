import java.util.PriorityQueue;
import java.util.TreeSet;
public class LexicographicallySmaller{
    public static void main(String args[]){
        int n = 3, k = 9;
        System.out.println(lexicographicallySmaller(n,k));
    }
    public static String lexicographicallySmaller(int n , int k){
        //define the elemnets the sequences
        String s = "abc";

        //created priority queue to store elements in lexicographically smaller
        PriorityQueue<String> pq = new PriorityQueue<>(new TreeSet<>());

        generateHappyStrings(pq,n,s,new StringBuilder());

        while(k-->1)
          pq.poll();

        return pq.peek()==null?"":pq.poll();

    }
    public static void generateHappyStrings(PriorityQueue<String> pq, int n , String s, StringBuilder sb){
        if(sb.length() == n){
            pq.offer(sb.toString());
            return;
        }

        for(int i = 0;i<s.length();i++){
            if(sb.length() == 0 || sb.charAt(sb.length()-1) != s.charAt(i)){
                sb.append(s.charAt(i));
                generateHappyStrings(pq,n,s,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}