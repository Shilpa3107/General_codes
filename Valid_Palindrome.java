class Valid_Palindrome {
    public static void main(String args[]){
        String s = "ccbccc";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if(ch1!=ch2) 
                return check(s,left+1,right)||check(s,left,right-1);
            left++;
            right--;
        }
        return true;
    }
    public static boolean check(String s, int left, int right){
        while(left<right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            if(ch1!=ch2)
                return false;
            left++;
            right--;
        }
        return true;
    }
}