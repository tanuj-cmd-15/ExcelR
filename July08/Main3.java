import java.io.StringReader;

public record Main3() {
    public static void main(String[] args){

        String data = "This is the from string reader class";

        char[] array = new char[100];

        try{
            //create strinngreader
            StringReader input = new StringReader(data);

            //use read() method
            input.read(array);

            System.out.println("Data read from String: " );
            System.out.println(array);
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
