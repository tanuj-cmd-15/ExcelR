public class Main2 {
    public static void main(String[] args) {
        try{
            int divideByZero = 10/0;

        }
        catch(ArithmeticException e){
            System.out.println("Arithmatic Exception"+ e.getMessage());
        }
        finally{
            System.out.println("Thius is finally block");
        }
    }
}
