class Truncate {
    public static void main(String args[]){
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k) {
        String arr[] = s.split(" ");
        String str ="";
        int i = 0;
        while(i < k){
        str = str+" "+arr[i];
            i++;
        }
        str = str.trim();
        return str;
        
    }
}