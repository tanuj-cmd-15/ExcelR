import java.io.InputStreamReader;
import java.io.FileInputStream;

public class main2 {
    public static void main(String[] args) {
        char[] array = new char[100];

        try{
            //create a file using fileinputStream
            FileInputStream file = new FileInputStream("input.txt");

            //create an InputStreamReader
            InputStreamReader input = new InputStreamReader(file);

            //read chars from file
            input.read(array);
            System.out.println("Data in the file");
            System.out.println(array);

            //use getEncoding() to check the type of encoding
            System.out.println("Character encoding of input "+input.getEncoding());

            //close the rrader
            input.close();  
        }
        catch(Exception e){

        }
    }
}
