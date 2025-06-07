import java.util.Deque;
import java.util.ArrayDeque;
class ClearStars {
    public static void main(String args[]){
        String s = "aaba*";
         ClearStars obj = new ClearStars();
         System.out.println(obj.clearStars(s));
    }
    public String clearStars(String s) {
         @SuppressWarnings("unchecked")
         Deque<Integer>[] cnt = new Deque[26];
        for (int i = 0; i < 26; i++) {
            cnt[i] = new ArrayDeque<>();
        }
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*') {
                cnt[arr[i] - 'a'].push(i);
            } else {
                for (int j = 0; j < 26; j++) {
                    if (!cnt[j].isEmpty()) {
                        arr[cnt[j].pop()] = '*';
                        break;
                    }
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : arr) {
            if (c != '*') {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}