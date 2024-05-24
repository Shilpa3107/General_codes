import java.util.*;
public class MenuCalculator {
public static void main(String[] args){
 try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Menu");
    System.out.println("====");
    System.out.println("ADD");
    System.out.println("SUB");
    System.out.println("DIV");
    System.out.println("MUL");
    System.out.println("Enter 2 numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Enter the operation from the above menu");
    String str = sc.next();
    double ans = 0.0;
    switch(str){
        case "ADD": ans = a+b;
        break;
        case "SUB": ans = a-b;
        break;
        case "MUL": ans = a*b;
        break;
        case "DIV": ans = a/b;
        break;
        default: ans = 0.0;
    }
    System.out.println(ans);

}
}
}
