import java.util.*;
class Sorting {
    public static void main(String args[]){
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s)); 
    }
    public static String sortSentence(String s) {
        ArrayList<String> list = new ArrayList<String>();
        list = returnstr(s);
        String str[] = new String[list.size()];
        for(int i = 0;i<list.size();i++){
           arrayform(list.get(i), str);
        }
        String m ="";
        for(int i = 0;i<str.length;i++){
            m = m+str[i]+" ";
        }
        return m.trim();
    }
    public static ArrayList<String> returnstr(String s){
        ArrayList<String> list = new ArrayList<String>();
        String m = "";
        s = s+" ";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                m = m+s.charAt(i);
            }
            else if(s.charAt(i) == ' '){
                list.add(m);
                m = "";
            }
        }
        return list;
    }
    public static void arrayform(String s, String str[]){
        String m="";
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) == false)
                m = m+s.charAt(i);
            else if(Character.isDigit(s.charAt(i))){
                int n = Integer.parseInt(""+s.charAt(i));
                str[n-1] = m;
                m = "";
            }
        } 
    }
}