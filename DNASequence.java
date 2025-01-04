import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class DNASequence{
    public static void main(String args[]){
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> list = dnaSequence(s);
        System.out.println(list);
    }
    public static List<String> dnaSequence(String s){
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<=s.length()-10;i++){
            map.put(s.substring(i,i+10),map.getOrDefault(s.substring(i,i+10),0)+1);
        }
        List<String> list = new ArrayList<>();
        for(String str : map.keySet()){
            if(map.get(str) >= 2)
              list.add(str);
        }
        return list;
    }
}