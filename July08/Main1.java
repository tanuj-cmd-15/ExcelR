import java.io.BufferedReader;
import java.io.FileReader;

public class Main1{
    public static void main(String[] args){
        char[] array = new char[100];

        try{
            //create a filereader
            FileReader file = new FileReader("input.txt");

            //create a buffer reader
            BufferedReader input = new BufferedReader(file);

            //skip the 5 character
            input.skip(5);

            //read character
            input.read(array);
            System.out.println("Data input file ");
            System.out.println(array);

            input.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}