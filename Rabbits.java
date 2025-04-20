import java.util.HashMap;
public class Rabbits{
    public static void main(String args[]){
        int answers[] = {1,1,2};
        System.out.println(numRabbits(answers));
    }
    public static int numRabbits(int answers[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : answers)
           map.put(n,map.getOrDefault(n,0)+1);
        int result = 0;
        for(int n : map.keySet()){
            int k = n;
            int count = map.get(n);
            int groupSize = k+1;
            int numGroup = (int)Math.ceil((double)count/groupSize);
            result += numGroup*groupSize;
        }
        return result;
    }
}