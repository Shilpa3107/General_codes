class FindComplement {
    public static void main(String args[]){
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            sb.append(Integer.toString(num%2));
            num = num/2;
        }
        sb.reverse();
        String s = "";
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i) == '0')
                s = s+'1';
            else if(sb.charAt(i) == '1')
                s = s+'0';
        }
        sb.setLength(0);
        int result = 0;
        int len = s.length();
        for(int i = 0;i<s.length();i++){
            result += Integer.parseInt(""+s.charAt(i))*Math.pow(2,--len);
        }
        return result;
    }
}