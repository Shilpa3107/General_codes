import java.util.ArrayList;
class MergeStringsAlternatively {
    public static void main(String args[]){
        String word1 = "abcd";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));
    }
    public static String mergeAlternately(String word1, String word2) {
       ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0;i<Math.min(word1.length(),word2.length());i++){
            list.add(word1.charAt(i));
            list.add(word2.charAt(i));
        }
        if(word1.length() > word2.length()){
            for(int i = word2.length();i<word1.length();i++){
                list.add(word1.charAt(i));
            }
        }
        if(word2.length() > word1.length()){
            for(int i = word1.length();i<word2.length();i++){
                list.add(word2.charAt(i));
            }
        }
        String s = "";
        for(char ch: list){
            s = s+ch;
        }
        return s;
    }
}