import java.util.*;
public class Relational{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter 3 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a > b && a > c)
            System.out.println(a+" is the greatest");
            else if(b > a && b > c)
            System.out.println(b+" is the greatest");
            else 
            System.out.println(c+" is the greatest");
        }
    }
}