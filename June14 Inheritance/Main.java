 class Animals{
    //parent class

    //Filed and name of parent class
    String name;

    public void eat(){
        System.out.println("I can eat");
    }
}

//Inherit method in subclass
class Dog extends Animals{
    //new method in subclass
    public void display(){
        System.out.println("My name is "+ name); //inheriting from animals
    }

}

class Main{
    public static void main(String[] args){
        //create an object of subclass

        Dog labardor = new Dog();

        //access filed pf super class
        labardor.name= "maku";
        labardor.display();

        //call method of superclass using same object

        labardor.eat();
    }
}