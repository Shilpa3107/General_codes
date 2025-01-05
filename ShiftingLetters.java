public class ShiftingLetters{
    public static void main(String args[]){
      String s = "abc";
      int shifts[][] = {{0,1,0},{1,2,1},{0,2,1}};
      System.out.println(shiftingLetters(s,shifts));
    }
    public static String shiftingLetters(String s, int shifts[][]){
    char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    StringBuilder sb = new StringBuilder(s);
    for(int n[] : shifts){
       for(int i = n[0];i<=n[1];i++){
        if(n[2] == 1){
            int ind = ((sb.charAt(i)-'a')+1+arr.length)%arr.length;
            sb.setCharAt(i,arr[ind]);
        }
        if(n[2] == 0){
            int ind = ((sb.charAt(i)-'a')-1+arr.length)%arr.length;
            sb.setCharAt(i,arr[ind]);
        }
       }
    }
    return sb.toString();
    }
}