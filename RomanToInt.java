import java.util.HashMap;
class RomanToInt {
    public static void main(String args[]){
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = 0;
        for(int i =0;i<s.length();i++){
            if(i < s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                ans -= map.get(s.charAt(i));
            }
               else{
               ans += map.get(s.charAt(i));
               }
        }
               return ans;
    }
}