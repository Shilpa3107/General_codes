import java.util.Scanner;
class Factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while(t-->0){
			    int n = sc.nextInt();
			    int f = 1;
			    for(int i = 1;i<=n;i++){
			        f = f*i;
			    }
			    System.out.println(f);
			}
		}
	}
}
