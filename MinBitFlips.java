class MinBitFlips {
    public static void main(String args[]){
        int start = 10;
        int goal = 7;
        System.out.println(minBitFlips(start,goal));
    }
    public static int minBitFlips(int start, int goal) {
        int count = 0;
        String s1 = binary(start);
        String s2 = binary(goal);
       if(s1.length() ==s2.length())
           count = count(s1,s2,count);
        else if(s1.length() != s2.length()){
            if(s1.length() < s2.length()){
               s1 = equal(s1,s2);
            }
            
            else
              s2 = equal(s2,s1);
             count = count(s1,s2,count);
        }
        
        return count;
    }
    public static String equal(String s1, String s2){
        int c = s2.length()-s1.length();
          while(c-->0){
             s1 = '0'+s1;
         }
        return s1;
    }
    public static int count(String s1, String s2, int count){
        for(int i = 0;i<Math.min(s1.length(),s2.length());i++){
                if(s1.charAt(i) != s2.charAt(i))
                    count++;
            }
          return count;     
    }
    public static String binary(int num){
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            sb.append(num%2);
            num = num/2;
        }
        sb.reverse();
        return sb.toString();
    }
}