import java.util.Scanner;
class LargestArea
{
	public static void main (String[] args) 
	{
		try(Scanner sc = new Scanner(System.in)){
		int t = sc.nextInt();
		while(t --> 0){
		    int n = sc.nextInt();
		    if(n < 4)
		    System.out.println(0);
		    else{
		    int length = (n/2)/2;
		    int width = (n/2)-length;
		    System.out.println(length*width);
		    }
        }
		}
	}
}