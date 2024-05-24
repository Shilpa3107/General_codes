import java.util.*;
public class Area{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter height and base of a triangle : ");
            int h = sc.nextInt();
            int b = sc.nextInt();
            double area = (b*h)/2;
            System.out.println("Area of a triangle is : "+area);
        }
    }
}