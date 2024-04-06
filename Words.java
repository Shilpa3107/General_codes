import java.util.ArrayList;

import java.util.*;

class Words {
    public static void main(String args[]){
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words,x));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<words.length;i++){
            if(count(words[i],x))
                list.add(i);
        }
        return list;
        
    }
    public static boolean count(String s, char x){
        boolean flag = false;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == x){
                flag = true;
                break;
            }
        }
        return flag;
    }
}