import java.util.*;
public class Username{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a username");
            String name = sc.next();
            System.out.println("Username: "+name);
        }
    }
}