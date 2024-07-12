class Maximum_Score_From_Removing_Substrings {
    public static void main(String args[]){
        String s="cdbcbbaaabab";
        int x = 4;
        int y = 5;
        System.out.println(maximumGain(s,x,y));
    }
    public static int maximumGain(String s, int x, int y) {
        int count=0;
        StringBuilder sb = new StringBuilder(s);
        if(x>=y){
            int count1 = 0,count2 = 0;
            count1 = check(sb,count1,'a','b');
            count2 = check(sb,count2,'b','a');
            count = count1*x+count2*y;
            System.out.println(sb+" "+count1+" "+count2);
        }
        else if(x<y){
            int count1 = 0,count2 = 0;
            count2 = check(sb,count2,'b','a');
            count1 += check(sb,count1,'a','b');
            count = count1*x+count2*y;
            System.out.println(sb+" "+count1+" "+count2);
        }
        
        return count;
    }
    public static int check(StringBuilder sb, int count, char s1, char s2){
        for(int i = sb.length()-2;i>=0;i--){
            if(i<sb.length()-1 && sb.charAt(i) == s1 && sb.charAt(i+1)==s2){
                count++;
                sb.delete(i,i+2);
            }
        }
        return count;
    }
}