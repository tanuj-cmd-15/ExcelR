import java.io.*;

public class Main4 {

    public static void FindFile() throws IOException {
        //code 
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
    public static void main(String[] args) {
        try{
            FindFile();
        }
        catch(IOException e){
            System.out.println(e);

        }
    }
}
