interface Language{
    void getName(String Name);

}

//class implements interface
class ProgrammingLanguage implements Language{

    //Implementing abstract method
    public void getName(String name){
        System.out.println("Programming language "+name);
    }
}



public class Example1{
    public static void main(String[] args) {
        ProgrammingLanguage L1 = new ProgrammingLanguage();
        L1.getName("Java");
    }
}