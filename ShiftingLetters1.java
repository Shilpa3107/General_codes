public class ShiftingLetters1{
   public static void main(String args[]){
    String s = "abc";
      int shifts[][] = {{0,1,0},{1,2,1},{0,2,1}};
      System.out.println(shiftingLetters(s,shifts));
   }
   public static String shiftingLetters(String s, int shifts[][]){
    int shift[] = new int[s.length()+1];
    for(int n[] : shifts){
        int start = n[0], end = n[1], direction = n[2];
        shift[start] += (direction == 1?1 :-1);
        if((end+1) < s.length())
          shift[end+1] -= (direction == 1?1:-1);
    }
    int currentSum = 0;
    for(int i = 0;i<s.length();i++){
        currentSum += shift[i];
        shift[i] = currentSum;
    }
    StringBuilder sb = new StringBuilder(s);
    for(int i = 0;i<s.length();i++){
        int ind = (shift[i]%26+26)%26;
        sb.setCharAt(i,(char)('a'+(s.charAt(i)-'a'+ind)%26));
    }
    return sb.toString();
   }
}