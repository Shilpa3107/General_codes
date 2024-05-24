import java.util.*;
public class MaximumCalculator {

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Maximum Number is "+Math.max(a,b));
        }
    }
}
