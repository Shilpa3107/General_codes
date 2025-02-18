public class ValidPalindrome2{
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <='z' || ch >='0' && ch <= '9')
              sb.append(ch);
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}