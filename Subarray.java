
import java.util.*;

class Subarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here
        Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int i = 0;i<n;i++){
                    a[i] = sc.nextInt();
                }
                ArrayList<Integer> sum = new ArrayList<Integer>();
                ArrayList<Integer> size = new ArrayList<Integer>();
                int sum1 =0;
                int count = 0;
                for(int i = 0;i<n;i++){
                    for(int j =i;j<n;j++){
                        for(int k = i;k<=j;k++){
                            sum1 +=a[k];
                            count++;
                        }
                        sum.add(sum1);
                        size.add(count);
                         sum1 = 0;
                         count = 0;
                    }
                }
                System.out.println(largest(sum,size));
                
            }
        }
	}
	public static int largest(ArrayList<Integer> sum, ArrayList<Integer> size1){
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    int max = 0;
	    for(int i = 0;i<sum.size();i++){
	        if(sum.get(i) %2 == 0)
	        list.add(i);
	    }
	    for(int i = 0;i<list.size();i++){
	        max = Math.max(max,size1.get(list.get(i)));
	    }
	    return max;
	}
}
