import java.util.*;
public class Example {

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
            String name = sc.next();
            int age = sc.nextInt();
            double salary = sc.nextDouble();
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Salary : "+salary);
        }
    }
}
