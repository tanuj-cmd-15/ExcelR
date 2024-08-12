import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main1{
    public static void main(String[] args){
        String data = "This is dat in the output file ";

        try{
            FileWriter file = new FileWriter("output.txt");

            //create buffered writter
            BufferedWriter output = new BufferedWriter(file);

            //write()
            output.write(data);

            //close()
            output.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}