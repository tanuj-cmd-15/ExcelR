class Employee{
    String name;
    int id;

    Employee(String name , int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println("name : "+name+ " Id : "+id);
    }
}

interface JavaDeveloper{
    void writeJavaCode();

}

interface PythonDeveloper{
    void writePythonCode();
}

class FullStackDeveloper extends Employee implements JavaDeveloper ,PythonDeveloper{
    FullStackDeveloper(String name, int id){
        super(name,id); //super class constructor
    }
    
    public void writeJavaCode(){
        System.out.println(name+" is a writing a java code");
    }

    public void writePythonCode(){
        System.out.println(name+ "is a writinga python code");
    }
}



public class Company {
    public static void main(String[] args) {
        FullStackDeveloper D = new FullStackDeveloper("john",111);
        D.display();

        D.writeJavaCode();
        D.writePythonCode();

    }
}
