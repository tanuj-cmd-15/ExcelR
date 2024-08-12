class Grand_Parent {
    // Base class
    String name;

    public void Print() {
        System.out.println("I am Grand_Parent ");
    }
}

class Parent extends Grand_Parent {

    //Intermediate CLass
    public void Print() {
        System.out.println("I am a Parent " + name);

    }
}

class Child1 extends Parent {
    //Derived class
    public void Print() {
        System.out.println("I am a Child " + name);
    }
}

public class Main3 {

    public static void main(String[] args) {

        // obj of child
        Child1 obj = new Child1();

        obj.name = "john";

        obj.Print();
    }
}
