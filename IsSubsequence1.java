public class IsSubsequence1{
    public static void main(String args[]){

        String s = "abc";
        String t = "abxcei";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t){
        StringBuilder sb = new StringBuilder(t);
        String str = "";
        int ind = 0;
        for(char ch : s.toCharArray()){
            for(int i = ind;i<sb.length();i++){
                if(ch == sb.charAt(i)){
                    str = str+sb.charAt(i);
                    ind = i;
                    sb.deleteCharAt(i);
                    break;
                }
            }
        }
        if(str.equals(s))
           return true;
        return false;
    }
}