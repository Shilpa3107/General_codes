public class CallByReference1 {
public static void main(String[] args) {
    
    int num[] = new int[1];
    num[0] = 10;
    System.out.println("Before : "+num[0]);
    incre(num);
    System.out.println("After : "+num[0]);
} 
public static void incre(int num[]){
    num[0] = num[0]+1;
}
}
