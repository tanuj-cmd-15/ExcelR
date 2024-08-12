
class Lamp{
    //Stores the value for lamp on.off
    boolean isOn;

    //method to turn on light on or
    void turnOn(){
        isOn = true;
        System.out.println("Light on? "+isOn);
    }

    //method to turn off light 
    void turnOff(){
        isOn = false;
        System.out.println("Light on? "+isOn);
    }
}

public class Example {

    public static void main(String[] args) {
        //create object led or halogen

        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
        


        //turn on light calling turnOn()
        led.turnOn();

        //turn off the halogen object
        halogen.turnOff();


    }
}
