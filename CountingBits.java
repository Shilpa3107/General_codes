public class CountingBits{
    public static void main(String args[]){
       int n = 5;
       int result[] = countingBits(n);
       for(int i : result)
         System.out.print(i+" ");
    }
    public static int[] countingBits(int n){
       int result[] = new int[n+1];
       for(int i = 0;i<=n;i++){
        result[i] = countOne(i);
       }
       return result;
    }
    public static int countOne(int n){
        int count = 0;
        String bit = Integer.toBinaryString(n);
        for(char ch : bit.toCharArray()){
            if(ch == '1')
            count++;
        }
        return count;
    }
}