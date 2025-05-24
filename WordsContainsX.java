import java.util.List;
import java.util.ArrayList;
class WordsContainsX {
    public static void main(String args[]){
        WordsContainsX obj = new WordsContainsX();
        List<Integer> list = obj.findWordsContaining(new String[]{"leet","code"},'e');
        for(int n : list)
           System.out.print(n+" ");
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            if(words[i].contains(""+x))
              list.add(i);
        }
        return list;
    }
}