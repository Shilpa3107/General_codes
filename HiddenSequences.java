public class HiddenSequences{
    public static void main(String args[]){
        int differences[] = {1,-3,4};
        int lower = 1;
        int upper = 6;
        System.out.println(hiddenSequences(differences,lower,upper));
    }
    public static int hiddenSequences(int differences[], int lower, int upper){
        int x = 0,y = 0, cur = 0;
        for(int n : differences){
            cur += n;
            x = Math.min(x,cur);
            y = Math.max(y,cur);
            if(y-x > upper-lower)
              return 0;
        }
        return (upper-lower)-(y-x)+1;
    }
}