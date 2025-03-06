import java.util.TreeMap;
public class MissingRepeated{
    public static void main(String args[]){
        int grid[][] = {{9,1,7},{8,9,2},{3,4,6}};
        int result[] = missingRepeated(grid);
        System.out.println(result[0]+" "+result[1]);
    }
    public static int[] missingRepeated(int grid[][]){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num[] : grid){
            for(int n : num)
              map.put(n, map.getOrDefault(n,0)+1);
        }
        int a = -1, count = 1;
        for(int n : map.keySet()){
            if(map.get(n) > 1){
                a = n;
                break;
            }
        }
        for(int n : map.keySet()){
            if(n != count)
              break;
            count++;
        }
        return new int[]{a,count};
    }
}