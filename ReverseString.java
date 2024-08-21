public class ReverseString{
    public static void main(String args[]){
        char ch[] = {'h','e','l','l','o'};
        reverse(ch);
        for(int i = 0; i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
    public static void reverse(char s[]){
        int i = 0;
        int j = s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}