public class Example4 {

//Overloading with different types of parameter

    private static void display(int a){
        System.out.println("argument : "+a);
    }
    private static void display(String a){
        System.out.println("String : "+a);
    }
    public static void main(String[] args){
        display(1);
        display("hello");
        
    }
    
}
