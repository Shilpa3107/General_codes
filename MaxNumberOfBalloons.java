import java.util.HashMap;
class MaxNumberOfBalloons {
    public static void main(String args[]){
        String text = "mbetypbpefxvviadqaodrbjeoacfomepmzymiudltgnvnpbowwmjgpzzhtiismearuwocsgbiimiqqzaozgeizikrlxmupfzjzmlfttqqbpfblqfkecsdfbsceqjhubfxksivrfwvukapxmuciybfhzlmpeamdxziptxregymqtmgcsujmugissgnlbhxbcxxeoumcqyulvahuianbaaxgzrtmshjguqdaxvxndzoqvwmcjfhpevavnrciqbymnlylbrfkkiceienoarfrzzxtuaqapaeqeqolozadmtgjyhfqzpuaskjuawxqkdqyjqcmbxtvshzrquvegcuyuckznspmrxvqdassidcmrajedsnuuumfwqzvasljlyvfefktiqgvzvdzojtjegsyhbepdkuwvgrfscezvswywmdavpxlekbrlkfnbyvlobazmvgulxrfdranuhomkrlpbfeagfxxxuhjuqhbkhznixquxrxngwimdxdhqbdaouitsvcdmbwxbbaomkgxsqwnexbjjyhtxvkjfqkrrxjghvzqsattubphryqxxdyjkihfnzvjhohnhdlfwoqiwtmwzfgcyhyqtcketvgnbchcxvnhcsoosirfqgdgcsitegzlxdfijzmxnvhrulmgvoqfpzesootscnxenokmmozmoxpaverydbsnimwacjqhrtxkqtvghjyushoctxphxzztukgmnoeycqaeukymvwxcsyvvctflqjhtcvjtxncuvhkptkjnzaetwbzkwnseovewuhpkaxiphdicgacszzdturzgjkzwgkmzzavykancvvzaafgzjhcyicorrblmhsnnkhfkujttbkuuedhwguuaapojmnjdfytdhrepjwcddzsoeutlbbljlikghxefgbqenwamanikmynjcupqpdjnhldaixwygcvsgdkzszmsptqqnroflgozblygtiyaxudwmooiviqcosjfksnevultrf";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char ch : text.toCharArray()){
            if(ch== 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch =='n')
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.size() < 5)
            return 0;
        
        int arr[] = new int[5];
        arr[0] = check(map,'b');
        arr[1] = check(map,'a');
        arr[2] = check(map,'l');
        arr[3] = check(map,'o');
        arr[4] = check(map,'n');
        int min = Math.min(arr[0],arr[1]);
        min = Math.min(min,arr[4]);
        
        if(arr[2] >= min*2 && arr[3] >= min*2){
            return min;
        }
        else if(arr[2] < min*2 && arr[3] < min*2){
            if(arr[2] < arr[3]){
               while(arr[2] < min*2){
                --min;
               }
            }
            else {
                while(arr[3] < min*2){
                --min;
                 }
            }
           return min;
        }
        return 0;
        
    }
    public static int check(HashMap<Character,Integer> map, char ch){
        if(map.containsKey(ch)){
            return map.get(ch);
        }
        return 0;
    }
}