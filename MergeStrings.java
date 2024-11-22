public class MergeStrings{
    public static void main(String args[]){
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeStrings(word1,word2));
    }
    public static String mergeStrings(String word1, String word2){
        String s = "";
        for(int i = 0;i<Math.min(word1.length(),word2.length());i++){
            s = s+word1.charAt(i);
            s = s+word2.charAt(i);
        }
        if(word1.length() > word2.length()){
            for(int i = word2.length();i<word1.length();i++)
              s = s+word1.charAt(i);
        }
        if(word2.length() > word1.length()){
            for(int i = word1.length();i<word2.length();i++)
              s = s+word2.charAt(i);
        }
        return s;
    }
}