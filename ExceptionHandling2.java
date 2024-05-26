class ExceptionHandling2{
    public static void main(String args[]){
         int age = 8;
            if(age < 18)
            throw new ArithmeticException("You are not eligibe");
            else 
            System.out.println("You are eligible");
    }
}