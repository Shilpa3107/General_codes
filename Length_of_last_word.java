import java.util.Scanner;
class Length_of_last_word {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String str[] = null;
        str = s.trim().split(" ");
        int k = str[str.length-1].length();
        
        return k;
        
    }
}