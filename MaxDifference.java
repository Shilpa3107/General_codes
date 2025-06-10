import java.util.HashMap;
import java.util.Map;
class MaxDifference {
    public static void main(String args[]){
        String s  = "aaaaabbc";
        MaxDifference obj = new MaxDifference();
        System.out.println(obj.maxDifference(s));
    }
    public int maxDifference(String s) {
         Map<Character, Integer> c = new HashMap<>();
        for (char ch : s.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        int maxOdd = 1, minEven = s.length();
        for (int value : c.values()) {
            if (value % 2 == 1) {
                maxOdd = Math.max(maxOdd, value);
            } else {
                minEven = Math.min(minEven, value);
            }
        }
        return maxOdd - minEven;
    }
}