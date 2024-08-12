public class Example4{
    
    String language;

    //first constructor
    Example4(){
        this.language ="Java";
    }

    //Second constructor with single parameter
    Example4(String language){
        this.language = language;
    }

    public void  getName() {
        System.out.println("programming language "+ this.language);
    }


    public static void main(String[] args) {
        //Call the constructor with no para
        Example4 obj = new Example4();

        //call constructor with parameter
        Example4 obj1 = new Example4("Python");

        obj.getName();
        obj1.getName();
    }
}