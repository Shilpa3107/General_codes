import java.util.*;
class Score {
    public static void main(String args[]){
        String s="hello";
        System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
       ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<s.length();i++){
            list.add((int)(s.charAt(i)));
        }
        int sum = 0;
        for(int i = 0;i<list.size()-1;i++){
            sum = sum+Math.abs(list.get(i)-list.get(i+1));
        }
        return sum;
    }
}