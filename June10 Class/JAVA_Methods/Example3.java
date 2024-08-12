public class Example3 {

    private static void display(int a){
        System.out.println("argument : "+a);
    }
    private static void display(int a, int b){
        System.out.println("Arguments : "+a+" & "+a);
    }
    public static void main(String[] args){
        display(1);
        display(1,2);
        
    }
    
}
