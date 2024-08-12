import java.io.FileReader;
public class Main1 {
    public static void main(String[] args) {
        char[] array = new char[100];

        try{
            //create a reader using fileReader and
            FileReader input = new FileReader("newFile.txt");

            //reads character
            input.read(array);
            System.out.println("Data in the file  : ");
            System.out.println(array);

            //close the reader
            input.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
