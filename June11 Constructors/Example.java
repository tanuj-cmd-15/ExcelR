public class Example{

    private String name;

    //defining Constructor
    Example(){
        System.out.println("Constructor called ");
        name =" ExcelR";
    }

    public static void main(String[] args){
        Example obj = new Example();
        System.out.println("The name is "+obj.name);
    }
}