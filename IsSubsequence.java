class IsSubsequence {
    public static void main(String args[]){
        String s = "abc";
        String t = "abidcyaf";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
       int len = 0;
        for(int i = 0;i<s.length();i++){
            len = check(t,s.charAt(i),len);
            if(len == -1)
                return false;
            len++;
        }
        return true;
    }
    public static int check(String t, char ch , int k){
     for(int i = k;i<t.length();i++){
         if(t.charAt(i) == ch)
             return i;
     }
        return -1;
    }
}