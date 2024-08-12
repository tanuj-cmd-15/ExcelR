public class InstanceOf {
    
    public static void main(String[] args) {
        
        //create a variable or string type
        String name = "ExcelR";

//check if name is instance of String
        boolean result = name instanceof String;
        System.out.println(result);

        //Create obj of the class
        InstanceOf obj = new InstanceOf();

        //check oobj is instance of example class
        boolean result2 = obj instanceof InstanceOf;
        System.out.println(result2);


    }
}
