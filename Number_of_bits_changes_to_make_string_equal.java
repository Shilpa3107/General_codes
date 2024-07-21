class Number_of_bits_changes_to_make_string_equal {
    public static void main(String args[]){
        int n = 13;
        int k = 4;
        System.out.println(minChanges(n,k));
    }
    public static int minChanges(int n, int k) {
        if(n==k)
            return 0;
        String a = binary(n);
        String b = binary(k);
        
        if(a.length()<b.length()){
           a = extra(a,b);
        }
        if(b.length()<a.length()){
            b = extra(b,a);
        }
       // System.out.print(a+" "+b);
            int count1 = 0, count2 = 0;
            
            for(int i = 0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i))
                    count1++;        //for counting number of unequal bits
                if(a.charAt(i)!=b.charAt(i) && a.charAt(i)=='1')
                    count2++;         //for counting if it is only 1 or not
            }
            if(count1==count2)
                return count1;
            else 
            return -1;
        
    }
    public static String binary(int n){
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append(n%2);
            n = n/2;
        }
        sb.reverse();
        return sb.toString();
    }
    public static String extra(String a, String b){
            String extra = "";
            int len = b.length()-a.length();
            for(int i = 0;i<len;i++){
                extra = extra+"0";
            }
            a = extra+a;
        return a;
    }
}