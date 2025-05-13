class LengthAfterTransformations {
    public static void main(String args[]){
        System.out.println(lengthAfterTransformations("abcyy",2));
    }
    public static int lengthAfterTransformations(String s, int t) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        while(t-->0){
            int next[] = new int[26];
            next[0] = freq[25];
            next[1] = (freq[25]+freq[0])%1000000007;
            for(int j = 2;j<26;j++){
                next[j] = freq[j-1];
            }
             freq = next;
        }
        int ans = 0;
        for(int i = 0;i<26;i++){
            ans = (ans+freq[i])%1000000007;
        }
        return ans;
    }
}