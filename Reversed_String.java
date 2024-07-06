import java.util.*;

class Reversed_String {

    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        String str= "";
        for(int i = s.length()-1;i>=0;i--){
            str = str+s.charAt(i);
        }
        System.out.println(str.charAt(k-1));
    }
}