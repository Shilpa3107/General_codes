import java.util.ArrayList;
public class Dictionary{
    static ArrayList<String> list;
    public static void main(String args[]){
       dictionary();
       addWord("at");
       addWord("and");
       addWord("an");
       addWord("add");
       System.out.println(search("a"));
       System.out.println(search(".at"));
       System.out.println(search("bat"));
       System.out.println(search(".at"));
       System.out.println(search("an."));
       System.out.println(search("a.d."));
       System.out.println(search("b."));
       System.out.println(search("a.d"));
       System.out.println(search("."));
    }
    public static void dictionary(){
       list = new ArrayList<String>();
    }
    public static void addWord(String word){
        list.add(word);
    }
    public static boolean search(String word){
        for(String s : list){
            if(s.length() == word.length()){
                boolean flag = true;
                for(int i = 0;i<s.length();i++){
                    if(word.charAt(i) != '.' && word.charAt(i) != s.charAt(i)){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                 return true;
            }
        }
        return false;
    }
}