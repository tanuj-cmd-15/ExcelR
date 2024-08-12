public class Main5 {

    public static void main(String[] args) {
        try{
            int array[] = new int[10];
            array[11] = 30;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
