public class CountPrefixAndSuffix{
    public static void main(String args[]){
        String words[] = {"a","aba","ababa","aa"};
        System.out.println(countPrefixAndSuffix(words));
    }
    public static int countPrefixAndSuffix(String words[]){
        int count = 0;
        for(int i = 0;i<words.length;i++){
            count += check(words,words[i],i);
        }
        return count;

    }
    public static int check(String words[], String s, int ind){
        int count = 0;
        for(int i = ind+1;i<words.length;i++){
            if(s.length() <= words[i].length() && s.equals(words[i].substring(0,s.length())) && s.equals(words[i].substring(words[i].length()-s.length(),words[i].length())))
              count++;
        }
        return count;
    }
}