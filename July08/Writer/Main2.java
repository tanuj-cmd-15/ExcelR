import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


public class Main2 {
    public static void main(String[] args) {
        String data = "This is line of text inside of file";

        try{

            FileOutputStream file = new FileOutputStream("Output2.txt");

            //create Outputstreamwritter
            OutputStreamWriter output = new OutputStreamWriter(file);

            //write data in the file

            output.write(data);

            //get encoding 
System.out.println("using getencoding "+ output.getEncoding());

            output.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
