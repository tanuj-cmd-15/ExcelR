import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        //create a fioe object \
        File file= new File("newfile.txt");

        //delets the file from
        boolean value = file.delete();
        if(value) {
            System.out.println("File is deleeted successsfully ");
        }
        else{
            System.out.println("the file is doesn't exist ");
        }
    }
}
