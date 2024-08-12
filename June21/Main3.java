public class Main3{
    public static void divideByZero(){
        throw new ArithmeticException("Trying divide by zero ");
    } 
    public static void main(String[] args){
        divideByZero();
    }
}