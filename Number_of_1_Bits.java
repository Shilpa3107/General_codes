class Number_of_1_Bits {
    public static void main(String args[]){
       System.out.println(hammingWeight(128));
    }
    public static int hammingWeight(int n) {
        String s = "";
        while(n > 0){
            s = s+Integer.toString(n%2);
            n = n/2;
        }
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1')
                count++;
        }
        return count;
    }
}