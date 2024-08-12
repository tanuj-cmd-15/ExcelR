public class Main1{
    public static void main(String[] args) {
        try {
            int divideByZero =5/0;
            System.out.println("the try block ");
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmeticException = "+ e.getMessage());

        }
    }
}