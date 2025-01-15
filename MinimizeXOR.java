public class MinimizeXOR{
    public static void main(String args[]){
        int num1 = 25;
        int num2 = 72;
        System.out.println(minimizeXOR(num1,num2));
    }
    public static int minimizeXOR(int num1, int num2){
        int bitCount = Integer.bitCount(num2);
        bitCount -= Integer.bitCount(num1); // to check if num1 has extra bits or less bits
        int curr = 1; // least significant bit position
        while(bitCount != 0){
            if(bitCount < 0 && (num1&curr) != 0){  // num1 has extra bits and current bit of num1 is at the same postion cur
               num1 = num1^curr; // flips the position
               bitCount++;
            }
            else if(bitCount > 0 && (num1&curr) == 0){ //num1 has fewer bits and current bit of num1 is not at the same position cur
                num1 = num1|curr;
                bitCount--;
            }
            curr = curr<<1;   // it moves to the next least significant bit
        }
        return num1;
    }
}