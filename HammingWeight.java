public class HammingWeight{
    public static void main(String args[]){
       int n = 128;
       System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n){
        int count = 0;
        String bit = Integer.toBinaryString(n);
        for(char ch : bit.toCharArray()){
            if(ch == '1')
              count++;
        }
        return count;
    }
}