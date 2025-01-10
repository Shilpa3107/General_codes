import java.util.List;
import java.util.ArrayList;
public class WordSubsets{
    public static void main(String args[]){
      String words1[] = {"amazon","apple","facebook","google","leetcode"};
      String words2[] = {"e","o"};
      List<String> list = wordSubsets(words1,words2);
      for(String s : list)  
        System.out.print(s+" ");
    }
    public static List<String> wordSubsets(String words1[], String words2[]){
        List<String> list = new ArrayList<>();
        int maxFreq[] = new int[26];
        for(String word : words2){
            int freq[] = getFreq(word);
            for(int i = 0;i<26;i++)
              maxFreq[i] = Math.max(maxFreq[i],freq[i]);
        }
        for(String word : words1){
            int freq[] = getFreq(word);
            if(check(freq,maxFreq))
              list.add(word);
        }
        return list;
    }
    public static int[] getFreq(String word){
        int freq[] = new int[26];
        for(char ch : word.toCharArray())
          freq[ch-'a']++;
        return freq;
    }
    public static boolean check(int freq[], int maxFreq[]){
        for(int i = 0;i<26;i++){
            if(freq[i] < maxFreq[i])
              return false;
        }
        return true;
    }
}