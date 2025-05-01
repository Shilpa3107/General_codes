import java.util.ArrayList;
public class LengthLastWord{
    public static void main(String args[]){
         System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i) == ' '){
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        list.add(sb.toString());
        return list.get(list.size()-1).length();
    }
}