class StringCompression1 {
    public static void main(String args[]){
        char chars[] = {'a','a','b','b','c','c','c'};
        for(int i = 0;i<compress(chars);i++)
          System.out.print(chars[i]+" ");
    }
    public static int compress(char[] chars) {
        int count = 1;
        char ch = chars[0];
        String s = "";
        for(int i = 1;i<chars.length;i++){
            if(ch == chars[i]){
                count++;
            }
            if(ch != chars[i]){
                if(count != 1)
                  s = s+ch+count;
                else 
                    s = s+ch;
                ch = chars[i];
                count = 1;
            }
        }
            if(count != 1)
                  s = s+ch+count;
                else 
                    s = s+ch;
        for(int i = 0;i<s.length();i++)
            chars[i] = s.charAt(i);
        return s.length();
    }
}