class ExceptionHandling1{
    public static void main(String args[]){
        try{
            int arr[] = new int[3];
            arr[3] = 30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occured");
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBounds Exception Occured");
        }
        finally{
        System.out.println("Rest of the code");
        }
    }
}