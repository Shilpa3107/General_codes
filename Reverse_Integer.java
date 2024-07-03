class Reverse_Integer {
    public static void main(String args[]){
        System.out.println(reverse(-123));
    }
    public static int reverse(int x) {
        long nums = 0;
        if(x >= 0){
            String s = Integer.toString(x);
            String k = "";
            for(int i = s.length()-1;i>=0;i--){
                k = k+s.charAt(i);
            }
            nums = Long.parseLong(k);
        }
        else{
            String s = Integer.toString(x);
            String k = "";
            for(int i = s.length()-1;i>=1;i--){
                k = k+s.charAt(i);
            }
            k = "-"+k;
            nums = Long.parseLong(k);
        }
        if(nums > Integer.MAX_VALUE || nums < Integer.MIN_VALUE)
        return 0;
        
        
        return (int)nums;
    }
}