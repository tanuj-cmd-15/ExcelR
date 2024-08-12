import java.io.StringWriter;

public class Main3 {
    public static void main(String[] args) {
        String Data = "This is the string text";

        try{
            StringWriter output = new StringWriter();
            //write the string
            output.write(Data);
            
            System.out.println("Data in the StringWriter: "+output);

            output.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
