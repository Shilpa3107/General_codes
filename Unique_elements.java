import java.util.*;
class Unique_elements {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i = 0;i<n;i++){
            s[i] = sc.next();
        }
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<n;i++){
            list.add(count(s,s[i]));
        }
        ArrayList<String> lists = new ArrayList<String>();
        for(int i = 0;i<n;i++){
            if(list.get(i)==1)
            lists.add(s[i]);
        }
        System.out.print(lists.get(k-1));
    }
    public static int count(String s[], String str){
        int c = 0;
        for(int i = 0;i<s.length;i++){
            if(str.equals(s[i]))
            c++;
        }
        return c;
    }
}