//abstract class
abstract class Animal{

    //abstract method get
    abstract void makeSound(); 

    //Normal method
    public void eat(){
        System.out.println("I can Eat");
    }
}

class Dog extends Animal{
    //provide implementation fro abstract class
    public void makeSound(){
        System.out.println("Bark Bark...");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meon Meon...");
    }
}

public class Example2 {
    public static void main(String[] args){

        //creat abject of dog class
        Dog obj1=new Dog();

        obj1.makeSound();
        obj1.eat();

        Cat c1 =new Cat();
        c1.makeSound();
    }
}
