import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class NutsAndBolts{
    public static void main(String args[]){
      int n = 5;
      char nuts[] = {'@','%','$','#','^'};
      char bolts[] = {'%','@','#','$','^'};
      nutsAndBolts(n,nuts,bolts);
      for(char ch : nuts)
        System.out.print(ch+" ");
    }
    public static void nutsAndBolts(int n, char nuts[], char bolts[]){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('!',0);
        map.put('#',1);
        map.put('$',2);
        map.put('%',3);
        map.put('&',4);
        map.put('*',5);
        map.put('?',6);
        map.put('@',7);
        map.put('^',8);
        HashMap<Integer,Character> reverseMap = new HashMap<>();
        for(Character key : map.keySet())
            reverseMap.put(map.get(key),key);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++)
          list.add(map.get(nuts[i]));
        Collections.sort(list);
        for(int i = 0;i<n;i++){
            nuts[i] = reverseMap.get(list.get(i));
            bolts[i] = reverseMap.get(list.get(i));
        }
        
    }
}