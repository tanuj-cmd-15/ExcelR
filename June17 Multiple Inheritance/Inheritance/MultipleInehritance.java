interface Backend{
    //abstract method
    public void ConnectServer();
} 

class Frontend{
    public void responsive(String str){
        System.out.println(str+" can also be used as frontend");
    }
}

//Language extend frontend and implements th backend
class Language extends Frontend implements Backend{
    String lang="java";

    //Implements method from the interface

    public void ConnectServer(){
        System.out.println(lang+ " can be used as a backend language");
    }
}


public class MultipleInehritance {
    public static void main(String[] args) {
        //create obj of language
        Language obj = new Language();
        obj.ConnectServer();

        //call the inherited method from frontend class
        obj.responsive(obj.lang);
    }
}
