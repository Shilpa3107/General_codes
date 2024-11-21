import java.util.*;
class SadCustomers
{
	public static void main (String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int a[] = new int[n];
                int b[] = new int[m];
                for(int i = 0;i<n;i++)
                  a[i] = sc.nextInt();
               for(int i = 0;i<m;i++)
                  b[i] = sc.nextInt();
               int count = 0;
               for(int i = 0;i<m;i++){
                   if(a[b[i]-1] != 0)
            	   a[b[i]-1] -=  1;
                    else 
                    count++;
               }
               System.out.println(count);
            }
        }
	}
}
