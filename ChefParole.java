import java.util.Scanner;
class ChefParole
{
	public static void main (String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n >= 7)
            System.out.println("YES");
            else 
            System.out.println("NO");
        }
	}
}
