import java.util.*;
class ConsecutiveOne 
{
    public static void main(String args[]){
        int n = 65535;
       StringBuilder sb = new StringBuilder();
       String binary="";
       while(n>0){
           int rem = n%2;
           binary += Integer.toString(rem);
           n = n/2;
       }
       sb.append(binary);
       sb.reverse();
       binary = sb.toString();
       System.out.println(binary);
       ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i<binary.length();i++){
            for(int j = i+1;j<=binary.length();j++){
                list.add(binary.substring(i,j));
            }
        }
        int max = 0;
        for(int i = 0;i<list.size();i++){
           max = Math.max(max,count(list.get(i)));
        }
        System.out.println(max);
      
        
    }
    public static int count(String s){
        int c = 0;
        for(int i= 0;i<s.length();i++){
            if((""+s.charAt(i)).equals("1"))
            c++;
            if((""+s.charAt(i)).equals("0"))
            c = 0;
        }
        return c;
    }
    
}
