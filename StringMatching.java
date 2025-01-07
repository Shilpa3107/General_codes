import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;
public class StringMatching{
    public static void main(String args[]){
      String words[] = {"mass","as","hero","superhero"};
      List<String> list = stringMatching(words);
      for(String n : list)
        System.out.print(n+" ");
    }
    public static List<String> stringMatching(String words[]){
        Arrays.sort(words,Comparator.comparing(s->s.length()));
        List<String> list = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
           if(check(words,words[i],i))
             list.add(words[i]);
        }
        return list;
    }
    public static boolean check(String words[], String s, int ind){
        for(int i = ind+1;i<words.length;i++){
            if(words[i].contains(s))
              return true;
        }
        return false;
    }
}