import java.io.File;

class main{
    public static void main(String[] args){
        //create a file for the current location
        File file = new File("newFile.txt");

        try{
            //trying to create a file  based ob the object
            boolean value = file.createNewFile();
            if(value){
                System.out.println("The new file has been suuccessfully created ");
            }else{
                System.out.println("The file is already exists");
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}