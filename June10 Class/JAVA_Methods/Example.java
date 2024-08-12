public class Example{
 
    //create a method
    public int addNumbers(int a, int b){
        int sum = a + b;
        return  sum;
    }
 
    public static void main(String[] args){
        int num1 = 25;
        int num2 = 11;
        Example obj = new Example();
        int result = obj.addNumbers(num1, num2);
        System.out.println(result);
    }
}