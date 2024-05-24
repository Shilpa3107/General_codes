public class SumN {
public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    int sum = 0;
    for(int i = 1;i<=num;i++)
      sum += i;
    System.out.println(sum);
}
}
