import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
public class PhoneDirectory{
    public static void main(String args[]){
       int n = 3;
       String contact[] = {"geeikistest", "geeksforgeeks", 
"geeksfortest"};
       String s = "geeips";
       ArrayList<ArrayList<String>> lists = phoneDirectory(n,contact,s);
       for(ArrayList<String> list : lists)
         System.out.println(list);
    }
    public static ArrayList<ArrayList<String>> phoneDirectory(int n, String contact[], String s){
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        for(int i = 1;i<=s.length();i++){
            HashSet<String> set = new HashSet<>();
            String prefix = s.substring(0,i);
            for(int j = 0;j<n;j++){
                int len = contact[j].length();
                if(len < i)
                  continue;
                String prefixContact = contact[j].substring(0,i);
                if(prefix.equals(prefixContact))
                   set.add(contact[j]);
            }
            ArrayList<String> temp;
            if(set.size() == 0){
                temp = new ArrayList<>();
                temp.add("0");
            }
            else{
                temp = new ArrayList<>(set);
                Collections.sort(temp);
            }
           lists.add(temp);
        }
        return lists;
    }
}