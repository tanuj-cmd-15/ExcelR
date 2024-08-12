import java.io.File;

public class Main5 {
    public static void main(String[] args){
        File folder = new File("myFolder");

        if(!folder.exists()){
            if(folder.mkdir()) {
                System.out.println("Folder created successfully ");
        }
        else{
            System.out.println("Failed to create a folder");
        }
        }

           
    }
}
