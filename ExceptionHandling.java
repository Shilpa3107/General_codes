import java.util.*;
public class ExceptionHandling{
    public static void main(String args[]){
        try{
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            
                c = a/b;
                System.out.println(c);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}