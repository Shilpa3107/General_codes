import java.util.*;
public class Quadratic{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter the coefficients of a quadratic equation: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int discriminant = b*b-4*a*c;
            double root1 = (-b+Math.sqrt(discriminant))/(2*a);
            double root2 = (-b-Math.sqrt(discriminant))/(2*a);
            System.out.println("Roots of the equation :"+root1+","+root2);

        }
    }
}