import java.util.HashMap;
class ValidString {
    public static void main(String args[]){
        String s = "2523533";
        ValidString obj = new ValidString();
        System.out.println(obj.findValidPair(s));
    }
    public String findValidPair(String s) {
        //created a hashmap to store the frequency
     HashMap<Character,Integer> map = new HashMap<>();

        //traverse in the array
        for(char ch : s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);

        //
        for(int i = 0;i<s.length()-1;i++){

            //storing the string in a variable
            String str = s.charAt(i)+""+s.charAt(i+1);

            //checking valid pair based on conditions
            if(s.charAt(i) != s.charAt(i+1) && map.get(s.charAt(i)) == Integer.parseInt(s.charAt(i)+"") && map.get(s.charAt(i+1)) == Integer.parseInt(s.charAt(i+1)+"") )

                //if matches return 
                return str;
        }

        //else return empty string
        return "";
    }
}