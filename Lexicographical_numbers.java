import java.util.List;
import java.util.ArrayList;
public class Lexicographical_numbers{
    public static void main(String args[]){
        int n = 13;
        System.out.println(lexiconumbers(n));
    }
    public static List<Integer> lexiconumbers(int n){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=9;i++){
            generatelexico(i,n,list);
        }
        return list;
    }
    public static void generatelexico(int start, int limit, List<Integer> list){
        if(start > limit)
        return;
        list.add(start);
        for(int i = 0;i<=9;i++){
            int nextnumber = start*10+i;
            if(nextnumber <= limit)
            generatelexico(nextnumber,limit,list);
            else 
            break;
        }
    }
}