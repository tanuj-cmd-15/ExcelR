import java.io.File;
import java.io.FileWriter;

public class Main2 {
    public static void main(String[] args){
        String data = "this is the data in output file by using fiilewrite ";
        try{
            FileWriter fw = new FileWriter("newFile.txt");

            //write wtring to the file
            fw.write(data);
            System.out.println("Data is written to The file");

            //close the write
            fw.close();

        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
