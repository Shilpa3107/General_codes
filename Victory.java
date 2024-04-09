import java.util.*;
class Victory
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int o = sc.nextInt();
            int c = sc.nextInt();
            int count = (((20-o)*6)*6)+c;
            if(count > r)
            System.out.println("Yes");
            else 
            System.out.println("No");
        }
	}
}
