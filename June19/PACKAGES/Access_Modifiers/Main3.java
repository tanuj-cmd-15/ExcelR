class Animal{
    public int LegCount ;
    public void display(){
        System.out.println("I am a animal");
        System.out.println("I have "+LegCount+" legs");
    }
}


public class Main3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.LegCount = 4;

        //acces method
        a.display();
    }
    
}
