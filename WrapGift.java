import java.util.Scanner;
public class WrapGift{
    public static void main(String args[]){
       try (Scanner sc = new Scanner(System.in)) {
        int t = sc.nextInt();
           while(t-->0){
            int h = sc.nextInt();
            int l = sc.nextInt();
            int w = sc.nextInt();
            System.out.println((int)Math.floor(1000/(2*(h*l+l*w+w*h))));
           }
    }
    }
}