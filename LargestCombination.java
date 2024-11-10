public class LargestCombination{
    public static void main(String args[]){

        int candidates[] = {16,17,71,62,12,24,14};
        System.out.println(largestCombination(candidates));
    }
    public static int largestCombination(int candidates[]){
        int maxBitLength = 0;
        for(int n : candidates)
          maxBitLength = Math.max(maxBitLength,Integer.toBinaryString(n).length());
        int bit[] = new int[maxBitLength];
        for(int n : candidates){
            for(int i = 0;i<maxBitLength;i++){
                if((n & (1 << i)) != 0)
                bit[i]++;
            }
        }
        int max = 0;
        for(int n : bit)
          max = Math.max(max,n);
          return max;
    }
}