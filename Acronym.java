import java.util.*;
class Acronym {
    public static void main(String args[]){
        ArrayList<String> words = new ArrayList<String>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s = "abc";
        System.out.println(isAcronym(words,s));
    }
    public static boolean isAcronym(List<String> words, String s) {
        String newStr = "";
        for(int i = 0;i<words.size();i++){
            String m = words.get(i);
            newStr = newStr+m.charAt(0);
        }
        boolean flag = false;
        if(newStr.equals(s))
            flag = true;
        else 
            flag = false;
        return flag;
    }
}
