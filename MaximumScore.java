public class MaximumScore{
    public static void main(String args[]){
        String s = "011101";
        System.out.println(maximumScore(s));
    }
    public static int maximumScore(String s){
       int max = countZero(s.substring(0,1))+countOne(s.substring(1));
      for(int i = 1;i<s.length();i++){
        max = Math.max(max,countZero(s.substring(0,i))+countOne(s.substring(i)));
      }
      return max;
    }
    public static int countZero(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0')
                count++;
        }
        return count;
    }
    public static int countOne(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1')
              count++;
        }
        return count;
    }
}