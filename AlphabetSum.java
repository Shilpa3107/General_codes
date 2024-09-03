class AlphabetSum {
    public static void main(String args[]){
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s,k));
    }
    public static int getLucky(String s, int k) {
       String str = "";
        for(char ch: s.toCharArray())
            str += Integer.toString(ch-'a'+1);
        while(k-->0){
            int dig = 0;
            for(char ch:str.toCharArray()){
                dig += ch-'0';
            }
            str = Integer.toString(dig);
        }
        return Integer.parseInt(str);
    }
    
}