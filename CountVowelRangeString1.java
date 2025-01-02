public class CountVowelRangeString1{
    public static void main(String args[]){
       String word[] = {"aba","bcb","ece","aa","e"};
        int queries[][] = {{0,2},{1,4},{1,1}};
        int arr[] = countVowelRangeStrings(word,queries);
        for(int n : arr)
          System.out.print(n+" ");
    }
    public static int[] countVowelRangeStrings(String word[] , int queries[][]){
      int arr[] = new int[queries.length];
      int j = 0;
      int c = 0;
      for(int n[] : queries){
        for(int i = n[0];i<=n[1];i++){
          if(checkValid(word[i])){
            c++;
          }
        }
        arr[j] = c;
        j++;
        c = 0;
      }
      return arr;
    }
    public static boolean checkValid(String s){
        if((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') && (s.charAt(s.length()-1) == 'a' || s.charAt(s.length()-1) == 'e' || s.charAt(s.length()-1) == 'i' || s.charAt(s.length()-1) == 'o' || s.charAt(s.length()-1) == 'u'))
           return true;
        return false;
    }
}