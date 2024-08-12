class Vehicle {
    // super class

    public void display() {
        System.out.println("I am a vehicle ");
    }
}

// car inherits vehicle
class Car extends Vehicle {
    // Subclass
    // Override the display()in parent class
    @Override
    public void display() {
        System.out.println("I am a Car");
    }

    //new meythod in subclass
    public void model() {
        System.out.println("I am a Maruti Suzuki");
    }
}

public class Main1 {
    public static void main(String[] args) {

        //creat an object of subsclass
        Car obj = new Car();

        Vehicle obj1 = new Vehicle();

        obj1.display();

        //call the display method
        obj.display();
        obj.model();
    }
}
