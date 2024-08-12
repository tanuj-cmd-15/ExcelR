//Abstract class
abstract class Language{
    //method of abstract class that implements
    public void display(){
        System.out.println("This is the language");
    }
}


public class Abstraction extends Language{
    public static void main(String[] args) {
        
        // create obj of Absrtraction class
        Abstraction obj = new Abstraction();

        //Accessing method of abstract class usinng obj of Abstraction class
        obj.display();


    }
}