public class Limit{
    public static void main(String args[]){
        int low = 1;
        int high = 100;
        System.out.println(limit(low,high));
    }
    public static int limit(int low, int high){
        int count = 0;
        for(int i = low;i<=high;i++){
            if(check(i))
              count++;
        }
        return count;
    }
    public static boolean check(int num){
        String s = Integer.toString(num);
        if(s.length()%2 != 0)
          return false;
        String first = s.substring(0,s.length()/2);
        String second = s.substring(s.length()/2);
        return sum(first) == sum(second);

    }
    public static int sum(String s){
        int total = 0;
        for(char ch : s.toCharArray()){
            total += ch-'0';
        }
        return total;
    }
}