class ReverseWords {
    public static void main(String args[]){
        String s ="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String m = "";
        int len = s.length();
        s = s+" ";
        String k = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' ')
                k = k+s.charAt(i);
            else if(i == len-1)
                s = s.trim();
            // if(s.charAt(i) == ' ')
            else {
               m = m+reverse(k)+" ";
                k ="";
            }
        }
        return m.trim();
    }
    public static String reverse(String k){
        String m = "";
        for(int i =k.length()-1;i>=0;i--){
            m = m+k.charAt(i);
        }
        return m;
    }
}