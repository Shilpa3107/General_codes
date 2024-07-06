import java.util.ArrayList;
class Reverse_Vowel {
    public static void main(String args[]){
        System.out.println(reverseVowels("hello"));
    }
    public static String reverseVowels(String s) {
        String k = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                k = k+s.charAt(i);
                list.add(i);
            }
        }
        
        String str = "";
        for(int i = k.length()-1;i>=0;i--){
            str = str+k.charAt(i);
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<list.size();i++){
            sb.setCharAt(list.get(i),str.charAt(i));           
        }
        return sb.toString();
    }
}