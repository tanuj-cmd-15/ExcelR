class Programming{
    public void display(){
        System.out.println(" I am a programming language");
    }
}
class Java extends Programming {
    @Override
    public void display(){
        System.out.println(" I am Java");
    }
}

public class Main2 {
    public static void main(String[] args) {
        
        //declare an obj variable
        Programming p1;

        //create obj of Programming
        p1 = new Programming();

        p1.display();

        //creat object of java class
        p1 = new Java();
        p1.display();
    }
}
