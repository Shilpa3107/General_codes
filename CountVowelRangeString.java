import java.util.ArrayList;
public class CountVowelRangeString{
    public static void main(String args[]){
        String word[] = {"aba","bcb","ece","aa","e"};
        int queries[][] = {{0,2},{1,4},{1,1}};
        int arr[] = countVowelRangeString(word,queries);
        for(int n : arr)
          System.out.print(n+" ");
    }
    public static int[] countVowelRangeString(String word[] , int queries[][]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int c = 0;
        list.add(c);
        for(String s : word){
           if(checkValidity(s)){
            c++;
            list.add(c);
           }
           else{
            list.add(c);
           }
        }
        int arr[] = new int[queries.length];
        int i = 0;
        for(int n[] : queries){
            arr[i] = list.get(n[1]+1)-list.get(n[0]);
            i++;
        }
        return arr;
    }
    public static boolean checkValidity(String s){
        if((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') && (s.charAt(s.length()-1) == 'a' || s.charAt(s.length()-1) == 'e' || s.charAt(s.length()-1) == 'i' || s.charAt(s.length()-1) == 'o' || s.charAt(s.length()-1) == 'u'))
            return true;
        return false;
    }
}