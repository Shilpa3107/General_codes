class Palindrome{
    public static void main(String args[]){
        String words[] = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
    public static String firstPalindrome(String[] words) {
        String str="";
        for(int i = 0;i<words.length;i++){
            if(palindrome(words[i])){
                str = words[i];
                break;
            }
        }
        return str;
    }
    public static boolean palindrome(String s){
        String str = "";
        for(int i = s.length()-1;i>=0;i--){
            str = str+s.charAt(i);
        }
        boolean flag = false;
        if(str.equals(s))
            flag = true;
        return flag;
    }
}