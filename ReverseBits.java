public class ReverseBits{
    public static void main(String args[]){
        int n = 43261596;
        System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n){
        String s = Integer.toBinaryString(n);
        int len = s.length();
        while(len < 32){
            s = '0'+s;
            len++;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return (int)Long.parseLong(sb.toString(),2);
    }
}