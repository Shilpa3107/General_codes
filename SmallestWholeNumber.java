import java.util.Scanner;
public class SmallestWholeNumber{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k!=0)
            System.out.println(n%k);
            else 
            System.out.println(n);
        }
        }
    }
}