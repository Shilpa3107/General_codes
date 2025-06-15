import java.util.HashSet;
import java.util.Set;
class MaxDiff {
  public static void main(String args[]){
    int num = 555;
    MaxDiff obj = new MaxDiff();
    System.out.println(obj.maxDiff(num));
  }
    public int maxDiff(int num) {
         String numStr = String.valueOf(num);
        Set<Character> uniqueDigits = new HashSet<>();
        for (char ch : numStr.toCharArray()) {
            uniqueDigits.add(ch);
        }

        int maxVal = num, minVal = num;

        for (char digit : uniqueDigits) {
            for (char newDigit = '0'; newDigit <= '9'; newDigit++) {
                if (numStr.charAt(0) == digit && newDigit == '0') continue;
                String newNumStr = numStr.replace(digit, newDigit);
                int newNum = Integer.parseInt(newNumStr);
                maxVal = Math.max(maxVal, newNum);
                minVal = Math.min(minVal, newNum);
            }
        }
        return maxVal - minVal;
    }
}