import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
class UncommonFromSentences {
    public static void main(String args[]){
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String arr[] = uncommonFromSentences(s1,s2);
        for(String s: arr)
        System.out.print(s+" ");
    }
    public static String[] uncommonFromSentences(String s1, String s2) {
       HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String word : s1.split(" "))
            map.put(word,map.getOrDefault(word,0)+1);
        for(String word: s2.split(" "))
            map.put(word,map.getOrDefault(word,0)+1);
        ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String, Integer> mapEle: map.entrySet()){
            if(mapEle.getValue() == 1)
                list.add(mapEle.getKey());
        }
        //System.out.println(map+" "+list);
        String arr[] = new String[list.size()];
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}