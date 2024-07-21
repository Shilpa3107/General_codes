class Vowels_in_a_game {
    public static void main(String args[]){
        String s = "leetcoder";
        System.out.println(doesAliceWin(s));
    }
    public static boolean doesAliceWin(String s) {
        int countVowels = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                countVowels++;
        }
        if(countVowels == 0)
            return false;
        else 
            return win(s);
        
    }
    public static boolean win(String s){
        StringBuilder sb = new StringBuilder(s);
        int count = 0,alice = 0,bob = 0;
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'){
               count++;
                if(count%2!=0){
                sb.delete(0,i);
                    alice++;
                }
                else{
                    sb.deleteCharAt(i);
                    bob++;
                }
            }
            
        }
        if(bob>alice || alice == 0)
            return false;
        return true;
    }
}