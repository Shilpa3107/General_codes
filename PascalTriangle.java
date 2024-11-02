import java.util.ArrayList;
import java.util.List;
public class PascalTriangle{
    public static void main(String args[]){
        int numRows = 5;
        List<List<Integer>> listoflist = pascalTriangle(numRows);
        for(List<Integer> list : listoflist){
            for(int n : list){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> listoflist = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            for(int j = 1;j<i;j++){
                int value = listoflist.get(i-1).get(j-1)+listoflist.get(i-1).get(j);
                list.add(value);
            }
            if(i > 0)
               list.add(1);
            listoflist.add(list);
        }
        return listoflist;
    }
}