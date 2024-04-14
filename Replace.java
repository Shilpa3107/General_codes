class Replace {
    public static void main(String args[]){
        String s = "a1c1e1";
        System.out.println(replaceDigits(s));
    }
    public static String replaceDigits(String s) {
        String str ="";
        str = str+s.charAt(0);
        for(int i =1;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int n = Integer.parseInt(""+s.charAt(i));
                str = str+alphabet(s.charAt(i-1),n);
            }
            else 
                str = str+s.charAt(i);
        }
        return str;
    }
    public static char alphabet(char ch, int ind){
        char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int n =0;
        for(int i=0;i<arr.length;i++){
            if(ch == arr[i]){
                n = ind+i;
                break;
            }
        }
        return arr[n];
    }
}