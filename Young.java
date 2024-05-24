import java.util.*;
public class Young {

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            if(age >= 14 && age <= 55)
            System.out.println("You are young");
            else 
            System.out.println("You are not young");
        }
    }
}
