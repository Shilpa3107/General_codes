class FaultyKeyboard {
    public static void main(String args[]){
        String str = "string";
        System.out.println(finalString(str));
    }
    public static String finalString(String s) {
        String m = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != 'i')
                m = m+s.charAt(i);
            else
                m = reverse(m);
                
        }
        return m;
    }
    public static String reverse(String m){
        String k = "";
        for(int i = m.length()-1;i>=0;i--){
            k = k+m.charAt(i);
        }
        return k;
    }
}